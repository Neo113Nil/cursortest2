package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import com.google.common.base.Ascii;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0456Dy {
    public static byte[] A0F;
    public static String[] A0G = {"68X6mTnOwXdfZzYVO84LiBNlITu89iQX", "mcCM", "SB1U", "GkXNtRrGsWIfNkCQn88aLdXmD8Z6vhvm", "Qey5CsRmzWj382X", "n9", "Qz1jsOzCfP5BXHleCyslZPCOD1Jlt2Hf", "OEfF4KTHhKUz1ci9ksApPyeCZN0rEDYT"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final C0438De A09;
    public final E3 A0A;
    public final ArrayList<RunnableC0453Dv> A0B;
    public final ArrayList<RunnableC0453Dv> A0C;
    public final CopyOnWriteArraySet<InterfaceC0449Dr> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{6, 69, 74, 71, 85, 78, 67, 85, 6, 81, 79, 82, 78, 6, 62, 36, 64, 117, 33, 109, 100, 96, 114, 117, 33, 110, 111, 100, 33, 69, 100, 114, 100, 115, 104, 96, 109, 104, 123, 100, 115, 33, 104, 114, 33, 115, 100, 112, 116, 104, 115, 100, 101, 47, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, Byte.MAX_VALUE, 122, 115, 54, Byte.MAX_VALUE, 57, 121, 42, Ascii.US, Ascii.CR, Ascii.NAK, 94, Ascii.ETB, Ascii.CR, 94, Ascii.US, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.SUB, 9, 60, 46, 54, 125, 46, 41, 60, 41, 56, 125, 52, 46, 125, 62, 53, 60, 51, 58, 56, 57};
    }

    static {
        A0C();
    }

    public C0456Dy(E3 e3, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        HI.A05(deserializerArr.length > 0, A05(16, 38, 36));
        this.A0A = e3;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new C0438De(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        HandlerThread handlerThread = new HandlerThread(A05(54, 24, 51));
        this.A08 = handlerThread;
        handlerThread.start();
        this.A06 = new Handler(handlerThread.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0453Dv A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        RunnableC0453Dv runnableC0453Dv = new RunnableC0453Dv(i, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0453Dv);
        A0J(A05(78, 13, 91), runnableC0453Dv);
        return runnableC0453Dv;
    }

    private void A08() {
        this.A06.post(new RunnableC0447Dp(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<InterfaceC0449Dr> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[3].charAt(7) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "Uj";
            strArr[4] = "M47RheKcpZxFkBs";
            if (hasNext) {
                it.next().ABW(this);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r9 = r8.A04;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0A() {
        boolean A0E;
        DownloadAction downloadAction;
        boolean canStartTask;
        DownloadAction downloadAction2;
        DownloadAction downloadAction3;
        if (!this.A02 || this.A03) {
            return;
        }
        boolean skipDownloadActions = this.A01 || this.A0B.size() == this.A04;
        for (int i = 0; i < this.A0C.size(); i++) {
            RunnableC0453Dv runnableC0453Dv = this.A0C.get(i);
            A0E = runnableC0453Dv.A0E();
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "ZZ";
            strArr[4] = "k3SOhcJE6F5rWIN";
            if (A0E && ((canStartTask = downloadAction.A03) || !skipDownloadActions)) {
                boolean z = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    RunnableC0453Dv runnableC0453Dv2 = this.A0C.get(i2);
                    downloadAction2 = runnableC0453Dv2.A04;
                    if (downloadAction2.A09(downloadAction)) {
                        if (!canStartTask) {
                            downloadAction3 = runnableC0453Dv2.A04;
                            if (downloadAction3.A03) {
                                z = false;
                                skipDownloadActions = true;
                                break;
                            }
                        } else {
                            z = false;
                            String str = runnableC0453Dv + A05(0, 14, 3) + runnableC0453Dv2;
                            runnableC0453Dv2.A08();
                        }
                    }
                    i2++;
                }
                if (z) {
                    runnableC0453Dv.A0A();
                    if (!canStartTask) {
                        this.A0B.add(runnableC0453Dv);
                        skipDownloadActions = this.A0B.size() == this.A04;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        DownloadAction downloadAction;
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i = 0; i < this.A0C.size(); i++) {
            downloadAction = this.A0C.get(i).A04;
            downloadActionArr[i] = downloadAction;
        }
        this.A06.post(new RunnableC0448Dq(this, downloadActionArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(RunnableC0453Dv runnableC0453Dv) {
        A0J(A05(91, 21, 120), runnableC0453Dv);
        C0455Dx A0K = runnableC0453Dv.A0K();
        Iterator<InterfaceC0449Dr> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            A0G[0] = "TUrgn6We5nsrVkZlQG2KUeV0nEHaGaai";
            if (hasNext) {
                it.next().AD8(this, A0K);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC0453Dv runnableC0453Dv) {
        if (this.A03) {
            return;
        }
        boolean z = !runnableC0453Dv.A0L();
        if (z) {
            this.A0B.remove(runnableC0453Dv);
        }
        A0D(runnableC0453Dv);
        if (A0G[3].charAt(7) == 'd') {
            throw new RuntimeException();
        }
        A0G[6] = "xCRZPuTuqF5VhljpIGNZbvIN3H6gjFvE";
        boolean stopped = runnableC0453Dv.A0M();
        if (stopped) {
            this.A0C.remove(runnableC0453Dv);
            A0B();
        }
        if (z) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC0453Dv runnableC0453Dv) {
        String str2 = str + A05(14, 2, 33) + runnableC0453Dv;
    }

    public final int A0O(DownloadAction downloadAction) {
        int i;
        int i2;
        HI.A04(!this.A03);
        RunnableC0453Dv A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            i2 = A02.A06;
            if (i2 == 0) {
                A0D(A02);
            }
        }
        i = A02.A02;
        return i;
    }

    public final void A0P() {
        HI.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC0449Dr interfaceC0449Dr) {
        this.A0D.add(interfaceC0449Dr);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0R() {
        HI.A04(!this.A03);
        if (!this.A02) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            if (this.A0C.get(i).A0L()) {
                return false;
            }
        }
        return true;
    }

    public final C0455Dx[] A0S() {
        HI.A04(!this.A03);
        C0455Dx[] c0455DxArr = new C0455Dx[this.A0C.size()];
        for (int i = 0; i < c0455DxArr.length; i++) {
            c0455DxArr[i] = this.A0C.get(i).A0K();
        }
        return c0455DxArr;
    }
}
