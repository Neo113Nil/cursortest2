package com.icefishing.icefishingliveapp;

import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public final class m implements G0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4553l f37087b;

    public /* synthetic */ m(AbstractActivityC4553l abstractActivityC4553l, int i) {
        this.f37086a = i;
        this.f37087b = abstractActivityC4553l;
    }

    @Override // G0.g
    public final void a(int i) {
        switch (this.f37086a) {
            case 0:
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.f37087b;
                if (i == 0) {
                    mainActivity.f37013W.setAlpha(1.0f);
                    mainActivity.f37018Z.setAlpha(0.5f);
                    mainActivity.f37021n0.setAlpha(0.5f);
                    mainActivity.f37022o0.setAlpha(0.5f);
                    mainActivity.f37024q0.setAlpha(0.5f);
                }
                if (i == 1) {
                    mainActivity.f37013W.setAlpha(0.5f);
                    mainActivity.f37018Z.setAlpha(1.0f);
                    mainActivity.f37021n0.setAlpha(0.5f);
                    mainActivity.f37022o0.setAlpha(0.5f);
                    mainActivity.f37024q0.setAlpha(0.5f);
                }
                if (i == 2) {
                    mainActivity.f37013W.setAlpha(0.5f);
                    mainActivity.f37018Z.setAlpha(0.5f);
                    mainActivity.f37021n0.setAlpha(1.0f);
                    mainActivity.f37022o0.setAlpha(0.5f);
                    mainActivity.f37024q0.setAlpha(0.5f);
                }
                if (i == 3) {
                    mainActivity.f37013W.setAlpha(0.5f);
                    mainActivity.f37018Z.setAlpha(0.5f);
                    mainActivity.f37021n0.setAlpha(0.5f);
                    mainActivity.f37022o0.setAlpha(1.0f);
                    mainActivity.f37024q0.setAlpha(0.5f);
                }
                if (i == 4) {
                    mainActivity.f37013W.setAlpha(0.5f);
                    mainActivity.f37018Z.setAlpha(0.5f);
                    mainActivity.f37021n0.setAlpha(0.5f);
                    mainActivity.f37022o0.setAlpha(0.5f);
                    mainActivity.f37024q0.setAlpha(1.0f);
                }
                if (i == 5) {
                    mainActivity.f37013W.setAlpha(0.5f);
                    mainActivity.f37018Z.setAlpha(0.5f);
                    mainActivity.f37021n0.setAlpha(0.5f);
                    mainActivity.f37022o0.setAlpha(0.5f);
                    mainActivity.f37024q0.setAlpha(0.5f);
                    break;
                }
                break;
        }
    }

    @Override // G0.g
    public final void b(int i) {
        switch (this.f37086a) {
            case 0:
                ((IntroActivity) this.f37087b).e(i);
                break;
        }
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
