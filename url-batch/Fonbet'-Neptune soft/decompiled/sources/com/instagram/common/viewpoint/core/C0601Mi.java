package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0601Mi extends BroadcastReceiver {
    public static String[] A03 = {"dggRIwntGnoxWZ7BDQUg45Sl6NQgoMuN", "38c9H60yn2P1pt17", "STlEyQPStERy8tSXGvH8F24LWNUxdBhq", "hCwe", "bKRxwQpiW0PmVHVfGUn2RavmyNEFkRji", "VPPe2MO9HED0sxCZzVAB8cvkabJHsXeP", "uH31h0PRXTyVkIOgrCb5PcgaQIfZ1AyX", "pPlbIWWtmQkYN3MHTwcOdVUNUzBLXTby"};
    public AbstractC1436iA A00;
    public InterfaceC0600Mh A01;
    public String A02;

    public C0601Mi(String str, AbstractC1436iA abstractC1436iA, InterfaceC0600Mh interfaceC0600Mh) {
        this.A00 = abstractC1436iA;
        this.A01 = interfaceC0600Mh;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC1175dh.A06.A04(this.A02));
        intentFilter.addAction(EnumC1175dh.A09.A04(this.A02));
        intentFilter.addAction(EnumC1175dh.A04.A04(this.A02));
        intentFilter.addAction(EnumC1175dh.A0A.A04(this.A02));
        intentFilter.addAction(EnumC1175dh.A05.A04(this.A02));
        intentFilter.addAction(EnumC1175dh.A0C.A04(this.A02));
        intentFilter.addAction(EnumC1175dh.A0B.A04(this.A02));
        intentFilter.addAction(EnumC1175dh.A03.A04(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC1175dh enumC1175dh = EnumC1175dh.A06;
        String action2 = this.A02;
        if (enumC1175dh.A04(action2).equals(action)) {
            this.A01.AF6(this.A00);
            return;
        }
        EnumC1175dh enumC1175dh2 = EnumC1175dh.A09;
        String action3 = this.A02;
        if (enumC1175dh2.A04(action3).equals(action)) {
            if (U7.A1t(context)) {
                this.A01.AF7(this.A00, AdError.AD_PRESENTATION_ERROR);
                return;
            } else {
                this.A01.AF7(this.A00, AdError.INTERNAL_ERROR);
                return;
            }
        }
        EnumC1175dh enumC1175dh3 = EnumC1175dh.A04;
        String action4 = this.A02;
        if (enumC1175dh3.A04(action4).equals(action)) {
            this.A01.AF3(this.A00);
            return;
        }
        EnumC1175dh enumC1175dh4 = EnumC1175dh.A0A;
        String action5 = this.A02;
        if (enumC1175dh4.A04(action5).equals(action)) {
            this.A01.AF5(this.A00);
            return;
        }
        EnumC1175dh enumC1175dh5 = EnumC1175dh.A05;
        String action6 = this.A02;
        boolean equals = enumC1175dh5.A04(action6).equals(action);
        if (A03[6].charAt(8) != 'X') {
            throw new RuntimeException();
        }
        A03[6] = "gVjZHTAPXXqW3paCpGTUxeCgOEd4dSxo";
        if (equals) {
            this.A01.onRewardedVideoClosed();
            return;
        }
        EnumC1175dh enumC1175dh6 = EnumC1175dh.A0B;
        String action7 = this.A02;
        if (enumC1175dh6.A04(action7).equals(action)) {
            InterfaceC0600Mh interfaceC0600Mh = this.A01;
            AbstractC1436iA abstractC1436iA = this.A00;
            String[] strArr = A03;
            if (strArr[2].charAt(25) != strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A03[6] = "QgP7tKiwXm5h6JnagwUE7gN68w8IQRlz";
            interfaceC0600Mh.AF1(abstractC1436iA);
            return;
        }
        EnumC1175dh enumC1175dh7 = EnumC1175dh.A0C;
        String action8 = this.A02;
        if (enumC1175dh7.A04(action8).equals(action)) {
            this.A01.AF2(this.A00);
            return;
        }
        EnumC1175dh enumC1175dh8 = EnumC1175dh.A03;
        String str = this.A02;
        if (A03[0].charAt(19) != 'F') {
            A03[1] = "4VvB4uonEo2HdG2J";
            String action9 = enumC1175dh8.A04(str);
            if (!action9.equals(action)) {
                return;
            }
        } else {
            String action10 = enumC1175dh8.A04(str);
            if (!action10.equals(action)) {
                return;
            }
        }
        this.A01.onRewardedVideoActivityDestroyed();
    }
}
