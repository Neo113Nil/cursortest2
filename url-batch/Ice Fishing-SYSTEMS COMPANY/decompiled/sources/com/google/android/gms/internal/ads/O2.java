package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class O2 implements InterfaceC3234g1, InterfaceC3701ol {

    /* renamed from: v, reason: collision with root package name */
    public static final O2 f26637v;

    /* renamed from: w, reason: collision with root package name */
    public static final O2 f26638w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26639n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26640u;

    static {
        int i = 0;
        f26637v = new O2(i, true);
        f26638w = new O2(i, false);
    }

    public /* synthetic */ O2(int i) {
        this.f26639n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        InterfaceC3539ll interfaceC3539ll = (InterfaceC3539ll) obj;
        switch (this.f26639n) {
            case 1:
                interfaceC3539ll.u(this.f26640u);
                break;
            default:
                interfaceC3539ll.z(this.f26640u);
                break;
        }
    }

    public String toString() {
        switch (this.f26639n) {
            case 0:
                boolean z8 = !this.f26640u;
                StringBuilder sb = new StringBuilder(String.valueOf(z8).length() + 33);
                sb.append("IncorrectFragmentation{expected=");
                sb.append(z8);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ O2(int i, boolean z8) {
        this.f26639n = i;
        this.f26640u = z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r9.h(8) == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O2(C3997uB c3997uB, C3244gB c3244gB) {
        this.f26639n = 5;
        int i = c3244gB.f30961a;
        boolean z8 = false;
        PA.n(i == 6 || i == 3);
        ByteBuffer byteBuffer = c3244gB.f30962b;
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        Er er = new Er(bArr, min);
        if (!c3997uB.f34550a) {
            if (!er.g()) {
                int h9 = er.h(2);
                boolean g9 = er.g();
                if (c3997uB.f34551b) {
                    throw new RA();
                }
                if (g9) {
                    boolean g10 = (h9 == 3 || h9 == 0) ? true : er.g();
                    er.e();
                    if (c3997uB.f34553d) {
                        if (er.g()) {
                            if (c3997uB.f34554e) {
                                er.e();
                            } else {
                                throw new RA();
                            }
                        }
                        if (!c3997uB.f34552c) {
                            if (h9 != 3) {
                                er.e();
                            }
                            er.f(c3997uB.f34555f);
                            if (h9 != 2 && h9 != 0 && !g10) {
                                er.f(3);
                            }
                            if (h9 != 3) {
                                if (h9 != 0) {
                                }
                            }
                        } else {
                            throw new RA();
                        }
                    } else {
                        throw new RA();
                    }
                }
                z8 = true;
            }
            this.f26640u = z8;
            return;
        }
        throw new RA();
    }
}
