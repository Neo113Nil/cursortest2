package net.idrnd.face.iad.capture.internal;

import android.util.Size;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.Arrays;
import kotlin.jvm.internal.Reflection;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.ImageFormat;

/* loaded from: classes9.dex */
public final class q {
    public final ImageFormat a;
    public final byte[] b;
    public final Size c;
    public final MatchResult.Destructured d;
    public final long e;

    public q(ImageFormat imageFormat, byte[] bArr, Size size, MatchResult.Destructured destructured, long j) {
        bArr.getClass();
        this.a = imageFormat;
        this.b = bArr;
        this.c = size;
        this.d = destructured;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (q.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            q qVar = (q) obj;
            return this.e == qVar.e && this.a == qVar.a && Arrays.equals(this.b, qVar.b) && this.c.equals(qVar.c) && this.d == qVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((Arrays.hashCode(this.b) + ((this.a.hashCode() + (Long.hashCode(this.e) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String simpleName = Reflection.factory.getOrCreateKotlinClass(q.class).getSimpleName();
        int length = this.b.length;
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("(format=");
        sb.append(this.a);
        sb.append(", content=ByteArray(size=");
        sb.append(length);
        sb.append("), size=");
        sb.append(this.c);
        sb.append(", imageInfo=");
        sb.append(this.d);
        return Boxes$$ExternalSyntheticOutline1.m(this.e, ", compressionTimestamp=", ")", sb);
    }
}
