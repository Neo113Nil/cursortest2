package com.aiming.mdt.a;

import com.aiming.mdt.utils.C0282;
import java.io.Closeable;

/* renamed from: com.aiming.mdt.a.ʻʼʾˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0052 implements Closeable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final C0110 f104;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private final InterfaceC0136 f105;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final AbstractC0117 f106;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f107;

    /* renamed from: com.aiming.mdt.a.ʻʼʾˊ$ʼ, reason: contains not printable characters */
    public static final class C0053 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f108;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private C0110 f109;

        /* renamed from: ʼ, reason: contains not printable characters */
        private AbstractC0117 f110;

        /* renamed from: ʽ, reason: contains not printable characters */
        private InterfaceC0136 f111;

        C0053() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final C0053 m170(InterfaceC0136 interfaceC0136) {
            this.f111 = interfaceC0136;
            return this;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final C0052 m171() {
            return new C0052(this, (byte) 0);
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0053 m172(AbstractC0117 abstractC0117) {
            this.f110 = abstractC0117;
            return this;
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final C0053 m173(int i) {
            this.f108 = i;
            return this;
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final C0053 m174(C0110 c0110) {
            this.f109 = c0110;
            return this;
        }
    }

    private C0052(C0053 c0053) {
        this.f107 = c0053.f108;
        this.f104 = c0053.f109;
        this.f105 = c0053.f111;
        this.f106 = c0053.f110;
    }

    /* synthetic */ C0052(C0053 c0053, byte b2) {
        this(c0053);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static C0053 m162() {
        return new C0053();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            if (this.f106 != null) {
                this.f106.mo51();
            }
            InterfaceC0136 interfaceC0136 = this.f105;
            if (interfaceC0136 != null) {
                try {
                    interfaceC0136.close();
                } catch (Exception e) {
                    C0282.m972("IOUtil", e);
                    C0076.m232().m236(e);
                }
            }
        } catch (Exception e2) {
            C0282.m972("Response close", e2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{mCode=");
        sb.append(this.f107);
        sb.append(", mHeaders=");
        sb.append(this.f104);
        sb.append(", mBody=");
        sb.append(this.f105);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final InterfaceC0136 m163() {
        return this.f105;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final int m164() {
        return this.f107;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final C0110 m165() {
        return this.f104;
    }
}
