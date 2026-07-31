package x;

import android.view.KeyEvent;
import l0.C0591a;

/* loaded from: classes.dex */
public final class K implements J {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9955d;

    public /* synthetic */ K(int i3) {
        this.f9955d = i3;
    }

    @Override // x.J
    public final int i(KeyEvent keyEvent) {
        int i3 = 0;
        switch (this.f9955d) {
            case 0:
                int i4 = L.f9956k;
                if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
                    if (keyEvent.isCtrlPressed()) {
                        long y3 = l0.c.y(keyEvent);
                        if (!(C0591a.a(y3, X.f10016b) ? true : C0591a.a(y3, X.f10031q))) {
                            if (!C0591a.a(y3, X.f10018d)) {
                                if (!C0591a.a(y3, X.f10020f)) {
                                    if (C0591a.a(y3, X.f10015a)) {
                                        return 26;
                                    }
                                    if (!C0591a.a(y3, X.f10019e)) {
                                        return C0591a.a(y3, X.f10021g) ? 46 : 0;
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
                        long d3 = l0.c.d(keyEvent.getKeyCode());
                        if (C0591a.a(d3, X.f10023i)) {
                            return 27;
                        }
                        if (C0591a.a(d3, X.f10024j)) {
                            return 28;
                        }
                        if (C0591a.a(d3, X.f10025k)) {
                            return 29;
                        }
                        if (C0591a.a(d3, X.f10026l)) {
                            return 30;
                        }
                        if (C0591a.a(d3, X.f10027m)) {
                            return 31;
                        }
                        if (C0591a.a(d3, X.f10028n)) {
                            return 32;
                        }
                        if (C0591a.a(d3, X.f10029o)) {
                            return 39;
                        }
                        if (C0591a.a(d3, X.f10030p)) {
                            return 40;
                        }
                        if (!C0591a.a(d3, X.f10031q)) {
                            return 0;
                        }
                    } else {
                        long d4 = l0.c.d(keyEvent.getKeyCode());
                        if (C0591a.a(d4, X.f10023i)) {
                            return 1;
                        }
                        if (C0591a.a(d4, X.f10024j)) {
                            return 2;
                        }
                        if (C0591a.a(d4, X.f10025k)) {
                            return 11;
                        }
                        if (C0591a.a(d4, X.f10026l)) {
                            return 12;
                        }
                        if (C0591a.a(d4, X.f10027m)) {
                            return 13;
                        }
                        if (C0591a.a(d4, X.f10028n)) {
                            return 14;
                        }
                        if (C0591a.a(d4, X.f10029o)) {
                            return 7;
                        }
                        if (C0591a.a(d4, X.f10030p)) {
                            return 8;
                        }
                        if (C0591a.a(d4, X.f10032r)) {
                            return 44;
                        }
                        if (C0591a.a(d4, X.f10033s)) {
                            return 20;
                        }
                        if (C0591a.a(d4, X.f10034t)) {
                            return 21;
                        }
                        if (!C0591a.a(d4, X.f10035u)) {
                            if (!C0591a.a(d4, X.f10036v)) {
                                if (!C0591a.a(d4, X.f10037w)) {
                                    return C0591a.a(d4, X.f10038x) ? 45 : 0;
                                }
                                return 17;
                            }
                            return 19;
                        }
                    }
                    return 18;
                }
                if (!C0591a.a(l0.c.d(keyEvent.getKeyCode()), X.f10021g)) {
                    return 0;
                }
                return 47;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long d5 = l0.c.d(keyEvent.getKeyCode());
                    if (C0591a.a(d5, X.f10023i)) {
                        i3 = 41;
                    } else if (C0591a.a(d5, X.f10024j)) {
                        i3 = 42;
                    } else if (C0591a.a(d5, X.f10025k)) {
                        i3 = 33;
                    } else if (C0591a.a(d5, X.f10026l)) {
                        i3 = 34;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long d6 = l0.c.d(keyEvent.getKeyCode());
                    if (C0591a.a(d6, X.f10023i)) {
                        i3 = 9;
                    } else if (C0591a.a(d6, X.f10024j)) {
                        i3 = 10;
                    } else if (C0591a.a(d6, X.f10025k)) {
                        i3 = 15;
                    } else if (C0591a.a(d6, X.f10026l)) {
                        i3 = 16;
                    }
                }
                return i3 == 0 ? M.f9957a.i(keyEvent) : i3;
        }
    }
}
