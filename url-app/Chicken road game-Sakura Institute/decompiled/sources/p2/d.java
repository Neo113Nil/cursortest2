package p2;

import b3.t;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes.dex */
public final class d implements InterfaceC0995b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0996c f9086b = new C0996c(0);

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f9087a;

    static {
        new C0996c(1);
    }

    @Override // p2.InterfaceC0995b
    public final boolean a(byte[] bArr) {
        String str;
        try {
            str = ((CharsetDecoder) f9086b.get()).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        this.f9087a.append(str);
        return true;
    }

    @Override // p2.InterfaceC0995b
    public final t b() {
        String sb = this.f9087a.toString();
        t tVar = new t(3);
        tVar.f5689e = sb;
        return tVar;
    }
}
