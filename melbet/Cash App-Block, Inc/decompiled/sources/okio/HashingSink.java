package okio;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class HashingSink extends ForwardingSink {
    public final Mac mac;
    public final MessageDigest messageDigest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(BlackholeSink blackholeSink, ByteString byteString) {
        super(blackholeSink);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(byteString.toByteArray(), "HmacSHA256"));
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        DurationKt.checkOffsetAndCount(buffer.size, 0L, j);
        Segment segment = buffer.head;
        segment.getClass();
        long j2 = 0;
        while (true) {
            byte[] bArr = segment.data;
            if (j2 >= j) {
                this.delegate.write(buffer, j);
                return;
            }
            int min = (int) Math.min(j - j2, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(bArr, segment.pos, min);
            } else {
                Mac mac = this.mac;
                mac.getClass();
                mac.update(bArr, segment.pos, min);
            }
            j2 += min;
            segment = segment.next;
            segment.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(BlackholeSink blackholeSink) {
        super(blackholeSink);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.messageDigest = messageDigest;
        this.mac = null;
    }
}
