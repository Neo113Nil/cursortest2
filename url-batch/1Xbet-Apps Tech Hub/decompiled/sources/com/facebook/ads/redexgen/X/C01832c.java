package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.provider.FontsContractCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.2c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01832c {
    public static C01832c A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C01822b>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C01822b>> A03 = new HashMap<>();
    public final ArrayList<C01812a> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, Ascii.ESC, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, Ascii.FS, 48, Base64.padSymbol, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, Ascii.SO, -1, 1, 9, Ascii.FF, 19, 9, 6, Ascii.EM, 6, Ascii.GS, 34, Ascii.EM, Ascii.SO, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C01832c(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2Z
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C01832c.this.A02();
                        break;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        };
    }

    public static C01832c A00(Context context) {
        C01832c c01832c;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C01832c(context.getApplicationContext());
            }
            c01832c = A05;
        }
        return c01832c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        C01812a[] c01812aArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c01812aArr = new C01812a[size];
                    this.A02.toArray(c01812aArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C01812a c01812a : c01812aArr) {
                int j = c01812a.A01.size();
                for (int nbr = 0; nbr < j; nbr++) {
                    C01822b c01822b = c01812a.A01.get(nbr);
                    if (!c01822b.A01) {
                        c01822b.A02.onReceive(this.A00, c01812a.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C01822b> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C01822b c01822b = remove.get(size);
                c01822b.A01 = true;
                for (int j = 0; j < c01822b.A03.countActions(); j++) {
                    String action = c01822b.A03.getAction(j);
                    ArrayList<C01822b> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            C01822b c01822b2 = arrayList.get(i2);
                            if (c01822b2.A02 == broadcastReceiver) {
                                c01822b2.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C01822b c01822b = new C01822b(intentFilter, broadcastReceiver);
            ArrayList<C01822b> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c01822b);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C01822b> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c01822b);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String str;
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String type = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                String str2 = A01(128, 15, 14) + resolveTypeIfNeeded + A01(62, 8, 14) + type + A01(51, 11, 42) + intent;
            }
            ArrayList<C01822b> arrayList = this.A03.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    String str3 = A01(70, 13, 23) + arrayList;
                }
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    C01822b c01822b = arrayList.get(i);
                    if (z) {
                        String str4 = A01(104, 24, 48) + c01822b.A03;
                    }
                    if (!c01822b.A00) {
                        str = resolveTypeIfNeeded;
                        int match = c01822b.A03.match(action, resolveTypeIfNeeded, type, data, categories, A01(83, 21, 127));
                        if (match >= 0) {
                            if (z) {
                                String str5 = A01(24, 27, 33) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c01822b);
                            c01822b.A00 = true;
                        } else if (z) {
                            switch (match) {
                                case FontsContractCompat.FontRequestCallback.FAIL_REASON_SECURITY_VIOLATION /* -4 */:
                                    A01 = A01(Opcodes.FCMPL, 8, 74);
                                    break;
                                case -3:
                                    A01 = A01(Opcodes.D2L, 6, 60);
                                    break;
                                case -2:
                                    A01 = A01(157, 4, 85);
                                    break;
                                case -1:
                                    A01 = A01(Opcodes.IF_ICMPLT, 4, 89);
                                    break;
                                default:
                                    A01 = A01(Opcodes.IF_ACMPEQ, 14, 6);
                                    break;
                            }
                            String str6 = A01(0, 24, 28) + A01;
                        }
                    } else if (z) {
                        str = resolveTypeIfNeeded;
                    } else {
                        str = resolveTypeIfNeeded;
                    }
                    i++;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C01822b) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new C01812a(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
