package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.ads.androidx.media3.exoplayer.offline.Download;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class BQ extends Handler {
    public static byte[] A0D;
    public static String[] A0E = {"iNmXvBj9FTihCrbZiC4S7zhCL1s9H33W", "EvGedAo1NbwIZrU2eJLjABwCKULHNO", "OhLMnivBPD1ct3YE1XOZQ5ppblACA0SV", "Bbpc8NZfeBPLrlsLcOoRpsaFZoo07Ukk", "cYMMpvUaIb0CtoOD5hU2j4Ih7c76pz", "QlCwnx", "3GDIv0eUOBpBneHy6OJWPXV1MBWevv42", "cGd21R9dzjO1"};
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final InterfaceC0323Bh A09;
    public final InterfaceC1691mT A0A;
    public final ArrayList<B8> A0B;
    public final HashMap<String, C1696mY> A0C;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0D = new byte[]{-42, -54, -9, 34, 42, 33, Ascii.US, 34, Ascii.DC4, Ascii.ETB, 0, Ascii.DC4, 33, Ascii.DC4, Ascii.SUB, Ascii.CAN, 37, -61, -34, -26, -23, -30, -31, -99, -15, -20, -99, -23, -20, -34, -31, -99, -31, -20, -12, -21, -23, -20, -34, -31, -73, -99, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -71, -68, -82, -79, 109, -79, -68, -60, -69, -71, -68, -82, -79, -64, 123, -99, -72, -64, -61, -68, -69, 119, -53, -58, 119, -61, -58, -72, -69, 119, -64, -59, -69, -68, -49, -123, -87, -60, -52, -49, -56, -57, -125, -41, -46, -125, -43, -56, -48, -46, -39, -56, -125, -55, -43, -46, -48, -125, -57, -60, -41, -60, -59, -60, -42, -56, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -65, -78, -70, -68, -61, -78, 109, -69, -68, -69, -78, -59, -74, -64, -63, -78, -69, -63, 109, -79, -68, -60, -69, -71, -68, -82, -79, -121, 109, -12, Ascii.SI, Ascii.ETB, Ascii.SUB, 19, Ascii.DC2, -50, 34, Ascii.GS, -50, 33, 19, 34, -50, Ascii.ESC, Ascii.SI, Ascii.FS, 35, Ascii.SI, Ascii.SUB, -50, 33, 34, Ascii.GS, Ascii.RS, -50, 32, 19, Ascii.SI, 33, Ascii.GS, Ascii.FS, -113, -86, -78, -75, -82, -83, 105, -67, -72, 105, -68, -82, -67, 105, -74, -86, -73, -66, -86, -75, 105, -68, -67, -72, -71, 105, -69, -82, -86, -68, -72, -73, -125, 105, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -20, -25, -37, -40, -21, -36, -105, -32, -27, -37, -36, -17, -91, -13, 0, Ascii.DC2, 10, -65, 5, 0, 8, Ascii.VT, 4, 3, -39, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0Q(DownloadRequest downloadRequest, int i) {
        B8 A06 = A06(downloadRequest.A02, true);
        long currentTimeMillis = System.currentTimeMillis();
        if (A06 != null) {
            A03(BT.A00(A06, downloadRequest, i, currentTimeMillis));
        } else {
            A03(new B8(downloadRequest, i != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i, 0));
        }
        A0B();
    }

    static {
        A0D();
    }

    public BQ(HandlerThread handlerThread, InterfaceC1691mT interfaceC1691mT, InterfaceC0323Bh interfaceC0323Bh, Handler handler, int i, int i2, boolean z) {
        super(handlerThread.getLooper());
        this.A08 = handlerThread;
        this.A0A = interfaceC1691mT;
        this.A09 = interfaceC0323Bh;
        this.A07 = handler;
        this.A02 = i;
        this.A03 = i2;
        this.A05 = z;
        this.A0B = new ArrayList<>();
        this.A0C = new HashMap<>();
    }

    public static int A00(B8 b8, B8 b82) {
        return AbstractC01484a.A08(b8.A05, b82.A05);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(String str) {
        for (int i = 0; i < i; i++) {
            DownloadRequest downloadRequest = this.A0B.get(i).A07;
            String[] strArr = A0E;
            String str2 = strArr[4];
            String str3 = strArr[2];
            int length = str2.length();
            int i2 = str3.length();
            if (length == i2) {
                throw new RuntimeException();
            }
            A0E[6] = "id4WW5MNYn317aHfBDbhwYGK6MIHb4Bm";
            if (downloadRequest.A02.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private B8 A03(B8 b8) {
        C3M.A08((b8.A02 == 3 || b8.A02 == 4) ? false : true);
        int A02 = A02(b8.A07.A02);
        if (A02 == -1) {
            this.A0B.add(b8);
            Collections.sort(this.A0B, new BP());
        } else {
            boolean z = b8.A05 != this.A0B.get(A02).A05;
            this.A0B.set(A02, b8);
            if (z) {
                Collections.sort(this.A0B, new BP());
            }
        }
        try {
            this.A0A.AGV(b8);
        } catch (IOException e) {
            AnonymousClass44.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A07.obtainMessage(2, new BO(b8, false, new ArrayList(this.A0B), null)).sendToTarget();
        return b8;
    }

    private B8 A04(B8 b8, int i, int i2) {
        C3M.A08((i == 3 || i == 4) ? false : true);
        return A03(A05(b8, i, i2));
    }

    public static B8 A05(B8 b8, int i, int i2) {
        return new B8(b8.A07, i, b8.A05, System.currentTimeMillis(), b8.A04, i2, 0, b8.A00);
    }

    private B8 A06(String str, boolean z) {
        int A02 = A02(str);
        if (A02 != -1) {
            return this.A0B.get(A02);
        }
        if (z) {
            try {
                return this.A0A.A7i(str);
            } catch (IOException e) {
                AnonymousClass44.A08(A08(2, 15, 106), A08(17, 25, 52) + str, e);
                return null;
            }
        }
        return null;
    }

    private C1696mY A07(C1696mY c1696mY, B8 b8) {
        boolean z;
        if (c1696mY == null) {
            if (A0U() && this.A01 < this.A02) {
                B8 A04 = A04(b8, 2, 0);
                C1696mY c1696mY2 = new C1696mY(A04.A07, this.A09.A5E(A04.A07), A04.A00, false, this.A03, this);
                this.A0C.put(A04.A07.A02, c1696mY2);
                int i = this.A01;
                this.A01 = i + 1;
                if (i == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                c1696mY2.start();
                return c1696mY2;
            }
            return null;
        }
        z = c1696mY.A06;
        C3M.A08(!z);
        c1696mY.A05(false);
        return c1696mY;
    }

    private void A09() {
        Iterator<C1696mY> it = this.A0C.values().iterator();
        while (it.hasNext()) {
            it.next().A05(true);
        }
        try {
            this.A0A.AIe();
        } catch (IOException e) {
            AnonymousClass44.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A0B.clear();
        this.A08.quit();
        synchronized (this) {
            this.A00 = true;
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0A() {
        String A08 = A08(2, 15, 106);
        ArrayList arrayList = new ArrayList();
        try {
            C1701md A7j = this.A0A.A7j(3, 4);
            while (A7j.A01()) {
                try {
                    arrayList.add(A7j.A00());
                } finally {
                }
            }
            if (A7j != null) {
                A7j.close();
            }
        } catch (IOException unused) {
            AnonymousClass44.A05(A08, A08(42, 25, 4));
        }
        for (int i = 0; i < this.A0B.size(); i++) {
            this.A0B.set(i, A05(this.A0B.get(i), 5, 0));
        }
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            if (A0E[6].charAt(14) != 'H') {
                break;
            }
            String[] strArr = A0E;
            strArr[1] = "XqOejHHacjjZLx98zpLnY1LZJhfsrk";
            strArr[7] = "zG4BgrMO4aUj";
            if (i2 < size) {
                ArrayList<B8> arrayList2 = this.A0B;
                B8 b8 = (B8) arrayList.get(i2);
                String[] strArr2 = A0E;
                if (strArr2[4].length() == strArr2[2].length()) {
                    break;
                }
                A0E[3] = "KT3y83B5rUupwCjllTydcOADIPFLf4ae";
                arrayList2.add(A05(b8, 5, 0));
                i2++;
            } else {
                List<Download> terminalDownloads = this.A0B;
                Collections.sort(terminalDownloads, new BP());
                try {
                    this.A0A.AJ5();
                } catch (IOException e) {
                    AnonymousClass44.A08(A08, A08(223, 23, 46), e);
                }
                ArrayList arrayList3 = new ArrayList(this.A0B);
                for (int i3 = 0; i3 < this.A0B.size(); i3++) {
                    this.A07.obtainMessage(2, new BO(this.A0B.get(i3), false, arrayList3, null)).sendToTarget();
                }
                A0B();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0B() {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < accumulatingDownloadTaskCount; i2++) {
            B8 download = this.A0B.get(i2);
            C1696mY c1696mY = this.A0C.get(download.A07.A02);
            int accumulatingDownloadTaskCount = download.A02;
            switch (accumulatingDownloadTaskCount) {
                case 0:
                    c1696mY = A07(c1696mY, download);
                    break;
                case 1:
                    A0M(c1696mY);
                    break;
                case 2:
                    C3M.A01(c1696mY);
                    A0P(c1696mY, download, i);
                    break;
                case 3:
                case 4:
                case 6:
                default:
                    throw new IllegalStateException();
                case 5:
                case 7:
                    A0O(c1696mY, download);
                    break;
            }
            if (c1696mY != null) {
                z = c1696mY.A06;
                if (!z) {
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0C() {
        for (int i = 0; i < i; i++) {
            B8 b8 = this.A0B.get(i);
            if (b8.A02 == 2) {
                try {
                    this.A0A.AGV(b8);
                } catch (IOException e) {
                    AnonymousClass44.A08(A08(2, 15, 106), A08(223, 23, 46), e);
                }
            }
        }
        sendEmptyMessageDelayed(11, 5000L);
    }

    private void A0E(int i) {
        this.A04 = i;
        C1701md c1701md = null;
        try {
            try {
                this.A0A.AIe();
                c1701md = this.A0A.A7j(0, 1, 2, 5, 7);
                while (c1701md.A01()) {
                    this.A0B.add(c1701md.A00());
                }
            } catch (IOException e) {
                AnonymousClass44.A08(A08(2, 15, 106), A08(67, 21, 14), e);
                this.A0B.clear();
            }
            AbstractC01484a.A10(c1701md);
            this.A07.obtainMessage(0, new ArrayList(this.A0B)).sendToTarget();
            A0B();
        } catch (Throwable th) {
            AbstractC01484a.A10(c1701md);
            throw th;
        }
    }

    private void A0F(int i) {
        this.A02 = i;
        A0B();
    }

    private void A0G(int i) {
        this.A03 = i;
    }

    private void A0H(int i) {
        this.A04 = i;
        A0B();
    }

    private void A0I(B8 b8) {
        if (b8.A02 == 7) {
            int i = b8.A03 == 0 ? 0 : 1;
            int state = b8.A03;
            A04(b8, i, state);
            A0B();
            return;
        }
        this.A0B.remove(A02(b8.A07.A02));
        try {
            this.A0A.AHh(b8.A07.A02);
        } catch (IOException unused) {
            String A08 = A08(2, 15, 106);
            String[] strArr = A0E;
            String str = strArr[1];
            String str2 = strArr[7];
            int length = str.length();
            int removeIndex = str2.length();
            if (length == removeIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[4] = "0mOws7zeqclkbY70VWtV8amCVjdjwc";
            strArr2[2] = "5byiBwQrvMTmrLaxdcHCyvzuNe0iHvcw";
            AnonymousClass44.A05(A08, A08(88, 30, 26));
        }
        this.A07.obtainMessage(2, new BO(b8, true, new ArrayList(this.A0B), null)).sendToTarget();
    }

    private void A0J(B8 b8, int i) {
        if (i == 0) {
            if (b8.A02 == 1) {
                A04(b8, 0, 0);
                return;
            }
            return;
        }
        int i2 = b8.A03;
        if (A0E[6].charAt(14) != 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "qDoL4xVSTO8RDQU7ZVoZcH2BhkCOc4";
        strArr[2] = "ugBXxeG19GlyVlR2WcoXaVyqVtSsbrKH";
        if (i == i2) {
            return;
        }
        int i3 = b8.A02;
        if (i3 == 0 || i3 == 2) {
            i3 = 1;
        }
        A03(new B8(b8.A07, i3, b8.A05, System.currentTimeMillis(), b8.A04, i, 0, b8.A00));
    }

    private void A0K(B8 b8, Exception exc) {
        int i;
        DownloadRequest downloadRequest = b8.A07;
        int i2 = exc == null ? 3 : 4;
        long j = b8.A05;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = b8.A04;
        int i3 = b8.A03;
        if (exc == null) {
            i = 0;
        } else {
            i = 1;
        }
        B8 b82 = new B8(downloadRequest, i2, j, currentTimeMillis, j2, i3, i, b8.A00);
        this.A0B.remove(A02(b82.A07.A02));
        try {
            this.A0A.AGV(b82);
        } catch (IOException e) {
            AnonymousClass44.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A07.obtainMessage(2, new BO(b82, false, new ArrayList(this.A0B), exc)).sendToTarget();
    }

    private void A0L(C1696mY c1696mY) {
        DownloadRequest downloadRequest;
        boolean z;
        boolean z2;
        Exception finalException;
        DownloadRequest downloadRequest2;
        downloadRequest = c1696mY.A04;
        String str = downloadRequest.A02;
        this.A0C.remove(str);
        z = c1696mY.A06;
        if (z) {
            this.A06 = false;
        } else {
            int i = this.A01 - 1;
            this.A01 = i;
            if (i == 0) {
                removeMessages(11);
            }
        }
        z2 = c1696mY.A08;
        if (z2) {
            A0B();
            return;
        }
        finalException = c1696mY.A01;
        if (finalException != null) {
            StringBuilder sb = new StringBuilder();
            String downloadId = A08(246, 13, 86);
            StringBuilder append = sb.append(downloadId);
            downloadRequest2 = c1696mY.A04;
            StringBuilder append2 = append.append(downloadRequest2);
            String downloadId2 = A08(0, 2, 97);
            String sb2 = append2.append(downloadId2).append(z).toString();
            String downloadId3 = A08(2, 15, 106);
            AnonymousClass44.A08(downloadId3, sb2, finalException);
        }
        B8 A06 = A06(str, false);
        if (A0E[3].charAt(4) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "ylCSlCHYxJLig8GFragBjcnbyuXWai";
        strArr[2] = "OMWcFhgpmCCD5KtgAO70M2kgxcAld7fK";
        B8 b8 = (B8) C3M.A01(A06);
        switch (b8.A02) {
            case 2:
                C3M.A08(!z);
                A0K(b8, finalException);
                break;
            case 3:
            case 4:
            case 6:
            default:
                throw new IllegalStateException();
            case 5:
            case 7:
                C3M.A08(z);
                A0I(b8);
                break;
        }
        A0B();
    }

    private void A0M(C1696mY c1696mY) {
        boolean z;
        if (c1696mY == null) {
            return;
        }
        z = c1696mY.A06;
        C3M.A08(!z);
        c1696mY.A05(false);
    }

    private void A0N(C1696mY c1696mY, long j) {
        DownloadRequest downloadRequest;
        downloadRequest = c1696mY.A04;
        B8 b8 = (B8) C3M.A01(A06(downloadRequest.A02, false));
        if (j == b8.A04 || j == -1) {
            return;
        }
        A03(new B8(b8.A07, b8.A02, b8.A05, System.currentTimeMillis(), j, b8.A03, b8.A01, b8.A00));
    }

    private void A0O(C1696mY c1696mY, B8 b8) {
        boolean z;
        if (c1696mY == null) {
            boolean z2 = this.A06;
            if (A0E[3].charAt(4) != '8') {
                throw new RuntimeException();
            }
            A0E[0] = "e4XXQnURg6mIpThj5jyh4wOBvzx0EgPt";
            if (z2) {
                return;
            }
            C1696mY c1696mY2 = new C1696mY(b8.A07, this.A09.A5E(b8.A07), b8.A00, true, this.A03, this);
            this.A0C.put(b8.A07.A02, c1696mY2);
            this.A06 = true;
            c1696mY2.start();
            return;
        }
        z = c1696mY.A06;
        if (!z) {
            c1696mY.A05(false);
        }
    }

    private void A0P(C1696mY c1696mY, B8 b8, int i) {
        boolean z;
        z = c1696mY.A06;
        C3M.A08(!z);
        if (!A0U() || i >= this.A02) {
            A04(b8, 0, 0);
            c1696mY.A05(false);
        }
    }

    private void A0R(String str) {
        B8 A06 = A06(str, true);
        if (A06 == null) {
            AnonymousClass44.A05(A08(2, 15, 106), A08(Opcodes.FNEG, 39, 4) + str);
        } else {
            A04(A06, 5, 0);
            A0B();
        }
    }

    private void A0S(String str, int i) {
        String A08 = A08(2, 15, 106);
        if (str == null) {
            for (int i2 = 0; i2 < this.A0B.size(); i2++) {
                A0J(this.A0B.get(i2), i);
            }
            try {
                this.A0A.AJ6(i);
            } catch (IOException e) {
                AnonymousClass44.A08(A08, A08(157, 32, 101), e);
            }
        } else {
            B8 A06 = A06(str, false);
            if (A06 != null) {
                A0J(A06, i);
            } else {
                try {
                    this.A0A.AJ7(str, i);
                } catch (IOException e2) {
                    AnonymousClass44.A08(A08, A08(Opcodes.ANEWARRAY, 34, 0) + str, e2);
                }
            }
        }
        A0B();
    }

    private void A0T(boolean z) {
        this.A05 = z;
        A0B();
    }

    private boolean A0U() {
        if (!this.A05) {
            int i = this.A04;
            if (A0E[6].charAt(14) != 'H') {
                throw new RuntimeException();
            }
            A0E[5] = "cfwXoVsCs";
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        boolean z = true;
        try {
            switch (message.what) {
                case 0:
                    A0E(message.arg1);
                    break;
                case 1:
                    A0T(message.arg1 != 0);
                    break;
                case 2:
                    A0H(message.arg1);
                    break;
                case 3:
                    A0S((String) message.obj, message.arg1);
                    break;
                case 4:
                    A0F(message.arg1);
                    break;
                case 5:
                    A0G(message.arg1);
                    break;
                case 6:
                    A0Q((DownloadRequest) message.obj, message.arg1);
                    break;
                case 7:
                    A0R((String) message.obj);
                    break;
                case 8:
                    A0A();
                    break;
                case 9:
                    A0L((C1696mY) message.obj);
                    z = false;
                    break;
                case 10:
                    A0N((C1696mY) message.obj, AbstractC01484a.A0N(message.arg1, message.arg2));
                    return;
                case 11:
                    A0C();
                    return;
                case 12:
                    A09();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.A07.obtainMessage(1, z ? 1 : 0, this.A0C.size()).sendToTarget();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
