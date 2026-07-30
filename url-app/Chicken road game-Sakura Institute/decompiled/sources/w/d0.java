package w;

import android.view.KeyEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9208a;

    public /* synthetic */ d0(int i7) {
        this.f9208a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a7, code lost:
    
        if (j1.a.a(r4.a.d(r10.getKeyCode()), w.l0.f9294g) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027e, code lost:
    
        if (j1.a.a(r0, w.l0.f9304q) != false) goto L197;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(KeyEvent keyEvent) {
        int i7;
        int i8 = 20;
        switch (this.f9208a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i9 = e0.f9221m;
                if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
                    if (keyEvent.isCtrlPressed()) {
                        long Y = j1.c.Y(keyEvent);
                        if (!(j1.a.a(Y, l0.f9289b) ? true : j1.a.a(Y, l0.f9304q))) {
                            if (!j1.a.a(Y, l0.f9291d)) {
                                if (!j1.a.a(Y, l0.f9293f)) {
                                    if (j1.a.a(Y, l0.f9288a)) {
                                        return 26;
                                    }
                                    if (!j1.a.a(Y, l0.f9292e)) {
                                        if (j1.a.a(Y, l0.f9294g)) {
                                            return 46;
                                        }
                                        return 0;
                                    }
                                    return 47;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        return 17;
                    }
                    if (!keyEvent.isCtrlPressed()) {
                        if (!keyEvent.isShiftPressed()) {
                            long d8 = r4.a.d(keyEvent.getKeyCode());
                            if (j1.a.a(d8, l0.f9296i)) {
                                return 1;
                            }
                            if (j1.a.a(d8, l0.f9297j)) {
                                return 2;
                            }
                            if (j1.a.a(d8, l0.f9298k)) {
                                return 11;
                            }
                            if (j1.a.a(d8, l0.f9299l)) {
                                return 12;
                            }
                            if (j1.a.a(d8, l0.f9300m)) {
                                return 13;
                            }
                            if (j1.a.a(d8, l0.f9301n)) {
                                return 14;
                            }
                            if (j1.a.a(d8, l0.f9302o)) {
                                return 7;
                            }
                            if (j1.a.a(d8, l0.f9303p)) {
                                return 8;
                            }
                            if (j1.a.a(d8, l0.f9305r)) {
                                return 44;
                            }
                            if (j1.a.a(d8, l0.f9306s)) {
                                return 20;
                            }
                            if (j1.a.a(d8, l0.f9307t)) {
                                return 21;
                            }
                            if (!j1.a.a(d8, l0.f9308u)) {
                                if (!j1.a.a(d8, l0.f9309v)) {
                                    if (!j1.a.a(d8, l0.f9310w)) {
                                        if (j1.a.a(d8, l0.f9311x)) {
                                            return 45;
                                        }
                                    }
                                    return 17;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        long d9 = r4.a.d(keyEvent.getKeyCode());
                        if (!j1.a.a(d9, l0.f9296i)) {
                            if (!j1.a.a(d9, l0.f9297j)) {
                                if (!j1.a.a(d9, l0.f9298k)) {
                                    if (!j1.a.a(d9, l0.f9299l)) {
                                        if (!j1.a.a(d9, l0.f9300m)) {
                                            if (!j1.a.a(d9, l0.f9301n)) {
                                                if (!j1.a.a(d9, l0.f9302o)) {
                                                    if (!j1.a.a(d9, l0.f9303p)) {
                                                        break;
                                                    } else {
                                                        return 40;
                                                    }
                                                } else {
                                                    return 39;
                                                }
                                            } else {
                                                return 32;
                                            }
                                        } else {
                                            return 31;
                                        }
                                    } else {
                                        return 30;
                                    }
                                } else {
                                    return 29;
                                }
                            } else {
                                return 28;
                            }
                        } else {
                            return 27;
                        }
                    }
                    return 0;
                }
                break;
                break;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long d10 = r4.a.d(keyEvent.getKeyCode());
                    if (j1.a.a(d10, l0.f9296i)) {
                        i7 = 41;
                    } else if (j1.a.a(d10, l0.f9297j)) {
                        i7 = 42;
                    } else if (j1.a.a(d10, l0.f9298k)) {
                        i7 = 33;
                    } else {
                        if (j1.a.a(d10, l0.f9299l)) {
                            i7 = 34;
                        }
                        i7 = 0;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long d11 = r4.a.d(keyEvent.getKeyCode());
                        if (j1.a.a(d11, l0.f9296i)) {
                            i7 = 9;
                        } else if (j1.a.a(d11, l0.f9297j)) {
                            i7 = 10;
                        } else if (j1.a.a(d11, l0.f9298k)) {
                            i7 = 15;
                        } else if (j1.a.a(d11, l0.f9299l)) {
                            i7 = 16;
                        }
                    }
                    i7 = 0;
                }
                if (i7 != 0) {
                    return i7;
                }
                l1.x xVar = f0.f9237a;
                xVar.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long d12 = r4.a.d(keyEvent.getKeyCode());
                    if (j1.a.a(d12, l0.f9296i)) {
                        i8 = 35;
                    } else if (j1.a.a(d12, l0.f9297j)) {
                        i8 = 36;
                    } else if (j1.a.a(d12, l0.f9298k)) {
                        i8 = 38;
                    } else {
                        if (j1.a.a(d12, l0.f9299l)) {
                            i8 = 37;
                        }
                        i8 = 0;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long d13 = r4.a.d(keyEvent.getKeyCode());
                    if (j1.a.a(d13, l0.f9296i)) {
                        i8 = 4;
                    } else if (j1.a.a(d13, l0.f9297j)) {
                        i8 = 3;
                    } else if (j1.a.a(d13, l0.f9298k)) {
                        i8 = 6;
                    } else if (j1.a.a(d13, l0.f9299l)) {
                        i8 = 5;
                    } else if (!j1.a.a(d13, l0.f9290c)) {
                        if (j1.a.a(d13, l0.f9307t)) {
                            i8 = 23;
                        } else if (j1.a.a(d13, l0.f9306s)) {
                            i8 = 22;
                        } else {
                            if (j1.a.a(d13, l0.f9295h)) {
                                i8 = 43;
                            }
                            i8 = 0;
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long d14 = r4.a.d(keyEvent.getKeyCode());
                    if (j1.a.a(d14, l0.f9302o)) {
                        i8 = 41;
                    } else {
                        if (j1.a.a(d14, l0.f9303p)) {
                            i8 = 42;
                        }
                        i8 = 0;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long d15 = r4.a.d(keyEvent.getKeyCode());
                        if (j1.a.a(d15, l0.f9306s)) {
                            i8 = 24;
                        } else if (j1.a.a(d15, l0.f9307t)) {
                            i8 = 25;
                        }
                    }
                    i8 = 0;
                }
                return i8 == 0 ? ((d0) xVar.f5847g).a(keyEvent) : i8;
        }
    }
}
