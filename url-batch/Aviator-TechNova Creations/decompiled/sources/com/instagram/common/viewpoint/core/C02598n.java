package com.instagram.common.viewpoint.core;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* renamed from: com.facebook.ads.redexgen.X.8n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02598n {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler(Looper.myLooper());
    public final /* synthetic */ C1720mw A02;

    public C02598n(final C1720mw c1720mw) {
        this.A02 = c1720mw;
        this.A00 = new AudioTrack.StreamEventCallback() { // from class: com.facebook.ads.redexgen.X.8m
            public static String[] A02 = {"8abdE8ICHAnxwFMUcOcB2jRAyUCGhoJo", "eSG1FX4JUeB6EOGXBLLAS9lOPW1", "25OZd6V", "MAJYraeiFmbj", "mUQNxKLiPMNWcUO6nW3zZtqSV9cqGhZ8", "VvmkF0iz3WmQeVV4Hfojcs5Qu1q9OORp", "gntz5ah2KiglLn2nngo2Gr7V9oibD8w7", "BsUxp7JWgCvt"};

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i) {
                AudioTrack audioTrack2;
                C8J c8j;
                boolean z;
                C8J c8j2;
                audioTrack2 = C02598n.this.A02.A0D;
                if (!audioTrack.equals(audioTrack2)) {
                    return;
                }
                c8j = C02598n.this.A02.A0I;
                if (c8j != null) {
                    C1720mw c1720mw2 = C02598n.this.A02;
                    String[] strArr = A02;
                    if (strArr[1].length() == strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A02[0] = "JFsW9FWtG581w4rAGivIJch2V9mOeS5l";
                    z = c1720mw2.A0X;
                    if (!z) {
                        return;
                    }
                    c8j2 = C02598n.this.A02.A0I;
                    c8j2.AEN();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(AudioTrack audioTrack) {
                AudioTrack audioTrack2;
                C8J c8j;
                boolean z;
                C8J c8j2;
                audioTrack2 = C02598n.this.A02.A0D;
                if (!audioTrack.equals(audioTrack2)) {
                    return;
                }
                c8j = C02598n.this.A02.A0I;
                if (c8j != null) {
                    C02598n c02598n = C02598n.this;
                    String[] strArr = A02;
                    if (strArr[3].length() != strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[3] = "n6LYwQPnbsiV";
                    strArr2[7] = "LQIZIXydZbX4";
                    z = c02598n.A02.A0X;
                    if (!z) {
                        return;
                    }
                    c8j2 = C02598n.this.A02.A0I;
                    c8j2.AEN();
                }
            }
        };
    }

    public final void A00(AudioTrack audioTrack) {
        Handler handler = this.A01;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC02578l(handler), this.A00);
    }

    public final void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages(null);
    }
}
