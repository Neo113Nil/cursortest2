package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.4V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4V extends AbstractC0858Ts<C0764Qb> implements C7P {
    public static String[] A02 = {"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    public YA A00;
    public boolean A01;

    public C4V(C0764Qb c0764Qb, YA ya) {
        super(c0764Qb);
        this.A00 = ya;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0E().A3G(i);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.K8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A06() {
        View view;
        WeakReference weakReference;
        boolean z;
        int i;
        int i2;
        int i3;
        C0765Qc c0765Qc;
        boolean wasViewable;
        Map map;
        Map map2;
        boolean z2;
        boolean z3;
        boolean z4;
        K8 k8;
        Handler handler;
        K8 k82;
        int i4;
        boolean z5;
        boolean z6;
        Map map3;
        C0765Qc c0765Qc2;
        C0764Qb A07 = A07();
        int i5 = 0;
        if (A07 == null) {
            A00(0);
            return;
        }
        view = A07.A0C;
        weakReference = A07.A0E;
        AbstractC0763Qa abstractC0763Qa = (AbstractC0763Qa) weakReference.get();
        int i6 = 1;
        boolean z7 = view == null;
        if (!z7 && abstractC0763Qa != null) {
            i = A07.A0A;
            C0765Qc A0E = C0764Qb.A0E(view, i, this.A00);
            if (A0E.A04()) {
                C0764Qb.A05(A07);
            } else {
                A07.A00 = 0;
            }
            i2 = A07.A00;
            i3 = A07.A09;
            boolean z8 = i2 > i3;
            c0765Qc = A07.A05;
            if (c0765Qc != null) {
                c0765Qc2 = A07.A05;
                if (c0765Qc2.A04()) {
                    wasViewable = true;
                    if (!z8 || !A0E.A04()) {
                        A07.A05 = A0E;
                    }
                    String valueOf = String.valueOf(A0E.A01());
                    synchronized (A07) {
                        map = A07.A06;
                        if (map.containsKey(valueOf)) {
                            map3 = A07.A06;
                            i5 = ((Integer) map3.get(valueOf)).intValue();
                        }
                        map2 = A07.A06;
                        map2.put(valueOf, Integer.valueOf(i5 + 1));
                    }
                    if (z8 && !wasViewable) {
                        this.A01 = true;
                        A07.A03 = System.currentTimeMillis();
                        z5 = A07.A07;
                        if (z5) {
                            this.A00.A0E().A3H();
                        }
                        abstractC0763Qa.A03();
                        if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(500L);
                            view.startAnimation(alphaAnimation);
                        }
                        z6 = A07.A0F;
                        if (!z6) {
                            return;
                        }
                    } else if (!z8 && wasViewable) {
                        this.A01 = true;
                        z3 = A07.A07;
                        if (z3) {
                            this.A00.A0E().A2n(A0E.A02());
                        }
                        abstractC0763Qa.A00();
                    } else {
                        abstractC0763Qa.A02();
                        if (!this.A01) {
                            z2 = A07.A07;
                            if (z2) {
                                this.A00.A0E().A3F(A0E.A02());
                            }
                        }
                        this.A01 = true;
                    }
                    z4 = A07.A08;
                    if (z4) {
                        return;
                    }
                    k8 = A07.A04;
                    if (k8 == null) {
                        return;
                    }
                    handler = A07.A0B;
                    k82 = A07.A04;
                    i4 = A07.A02;
                    handler.postDelayed(k82, i4);
                    return;
                }
            }
            wasViewable = false;
            if (!z8) {
            }
            A07.A05 = A0E;
            String valueOf2 = String.valueOf(A0E.A01());
            synchronized (A07) {
            }
        } else {
            z = A07.A07;
            if (z) {
                if (!z7) {
                    i6 = 2;
                }
                A00(i6);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7P
    public final YA A5p() {
        return this.A00;
    }
}
