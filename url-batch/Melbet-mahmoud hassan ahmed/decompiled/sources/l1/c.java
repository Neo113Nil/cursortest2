package l1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f18533a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f18534b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f18533a = byteArrayOutputStream;
        this.f18534b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f18533a.reset();
        try {
            b(this.f18534b, aVar.f18527f);
            String str = aVar.f18528g;
            if (str == null) {
                str = "";
            }
            b(this.f18534b, str);
            this.f18534b.writeLong(aVar.f18529h);
            this.f18534b.writeLong(aVar.f18530i);
            this.f18534b.write(aVar.f18531j);
            this.f18534b.flush();
            return this.f18533a.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }
}
