package w;

import android.view.KeyEvent;
import j0.C0706a;

/* loaded from: classes.dex */
public final class J implements InterfaceC1260I {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11034d;

    public /* synthetic */ J(int i2) {
        this.f11034d = i2;
    }

    @Override // w.InterfaceC1260I
    public final int r(KeyEvent keyEvent) {
        int i2 = 0;
        switch (this.f11034d) {
            case 0:
                int i4 = K.f11035n;
                if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
                    if (keyEvent.isCtrlPressed()) {
                        long A4 = j0.c.A(keyEvent);
                        if (!(C0706a.a(A4, W.f11095b) ? true : C0706a.a(A4, W.f11110q))) {
                            if (!C0706a.a(A4, W.f11097d)) {
                                if (!C0706a.a(A4, W.f11099f)) {
                                    if (C0706a.a(A4, W.f11094a)) {
                                        return 26;
                                    }
                                    if (!C0706a.a(A4, W.f11098e)) {
                                        return C0706a.a(A4, W.f11100g) ? 46 : 0;
                                    }
                                }
                                return 19;
                            }
                            return 18;
                        }
                        return 17;
                    }
                    if (keyEvent.isCtrlPressed()) {
                        return 0;
                    }
                    if (keyEvent.isShiftPressed()) {
                        long d4 = u3.d.d(keyEvent.getKeyCode());
                        if (C0706a.a(d4, W.f11102i)) {
                            return 27;
                        }
                        if (C0706a.a(d4, W.f11103j)) {
                            return 28;
                        }
                        if (C0706a.a(d4, W.f11104k)) {
                            return 29;
                        }
                        if (C0706a.a(d4, W.f11105l)) {
                            return 30;
                        }
                        if (C0706a.a(d4, W.f11106m)) {
                            return 31;
                        }
                        if (C0706a.a(d4, W.f11107n)) {
                            return 32;
                        }
                        if (C0706a.a(d4, W.f11108o)) {
                            return 39;
                        }
                        if (C0706a.a(d4, W.f11109p)) {
                            return 40;
                        }
                        if (!C0706a.a(d4, W.f11110q)) {
                            return 0;
                        }
                    } else {
                        long d5 = u3.d.d(keyEvent.getKeyCode());
                        if (C0706a.a(d5, W.f11102i)) {
                            return 1;
                        }
                        if (C0706a.a(d5, W.f11103j)) {
                            return 2;
                        }
                        if (C0706a.a(d5, W.f11104k)) {
                            return 11;
                        }
                        if (C0706a.a(d5, W.f11105l)) {
                            return 12;
                        }
                        if (C0706a.a(d5, W.f11106m)) {
                            return 13;
                        }
                        if (C0706a.a(d5, W.f11107n)) {
                            return 14;
                        }
                        if (C0706a.a(d5, W.f11108o)) {
                            return 7;
                        }
                        if (C0706a.a(d5, W.f11109p)) {
                            return 8;
                        }
                        if (C0706a.a(d5, W.f11111r)) {
                            return 44;
                        }
                        if (C0706a.a(d5, W.f11112s)) {
                            return 20;
                        }
                        if (C0706a.a(d5, W.f11113t)) {
                            return 21;
                        }
                        if (!C0706a.a(d5, W.f11114u)) {
                            if (!C0706a.a(d5, W.f11115v)) {
                                if (!C0706a.a(d5, W.f11116w)) {
                                    return C0706a.a(d5, W.f11117x) ? 45 : 0;
                                }
                                return 17;
                            }
                            return 19;
                        }
                    }
                    return 18;
                }
                if (!C0706a.a(u3.d.d(keyEvent.getKeyCode()), W.f11100g)) {
                    return 0;
                }
                return 47;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long d6 = u3.d.d(keyEvent.getKeyCode());
                    if (C0706a.a(d6, W.f11102i)) {
                        i2 = 41;
                    } else if (C0706a.a(d6, W.f11103j)) {
                        i2 = 42;
                    } else if (C0706a.a(d6, W.f11104k)) {
                        i2 = 33;
                    } else if (C0706a.a(d6, W.f11105l)) {
                        i2 = 34;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long d7 = u3.d.d(keyEvent.getKeyCode());
                    if (C0706a.a(d7, W.f11102i)) {
                        i2 = 9;
                    } else if (C0706a.a(d7, W.f11103j)) {
                        i2 = 10;
                    } else if (C0706a.a(d7, W.f11104k)) {
                        i2 = 15;
                    } else if (C0706a.a(d7, W.f11105l)) {
                        i2 = 16;
                    }
                }
                return i2 == 0 ? L.f11036a.r(keyEvent) : i2;
        }
    }
}
