package com.aiming.mdt.a;

import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0196 extends AbstractC0146 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private InterfaceC0197 f677;

    /* renamed from: com.aiming.mdt.a.ˊ$ʽ, reason: contains not printable characters */
    interface InterfaceC0197 {
        /* renamed from: ʻ */
        void mo643(C0052 c0052);

        /* renamed from: ʻʼ */
        void mo645(String str);
    }

    RunnableC0196(C0172 c0172) {
        super(c0172);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    if (this.f484 == null) {
                        if (this.f677 != null) {
                            this.f677.mo645("not http connection");
                        }
                        if (this.f484 != null) {
                            try {
                                this.f484.mo51();
                                return;
                            } catch (Exception e) {
                                C0282.m972("AsyncReq", e);
                                return;
                            }
                        }
                        return;
                    }
                    C0052 m437 = this.f484.m437(this.f485);
                    if (m437 == null) {
                        if (this.f677 != null) {
                            this.f677.mo645("response is null");
                        }
                    } else if (this.f677 != null) {
                        this.f677.mo643(m437);
                    }
                    if (this.f484 != null) {
                        this.f484.mo51();
                    }
                } catch (Throwable th) {
                    if (this.f484 != null) {
                        try {
                            this.f484.mo51();
                        } catch (Exception e2) {
                            C0282.m972("AsyncReq", e2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                if (this.f677 != null) {
                    this.f677.mo645(e3.getMessage());
                    C0282.m972("AsyncReq", e3);
                    if (this.f484 != null) {
                        this.f484.mo51();
                        return;
                    }
                    return;
                }
                if (this.f484 != null) {
                    try {
                        this.f484.mo51();
                    } catch (Exception e4) {
                        C0282.m972("AsyncReq", e4);
                    }
                }
            }
        } catch (Exception e5) {
            C0282.m972("AsyncReq", e5);
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m741(InterfaceC0197 interfaceC0197) {
        this.f677 = interfaceC0197;
    }
}
