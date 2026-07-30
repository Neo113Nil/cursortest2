package com.crrepa.j1;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final int f13009c = 128;

    /* renamed from: d, reason: collision with root package name */
    private static final int f13010d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f13011e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f13012f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f13013g = 6;

    /* renamed from: h, reason: collision with root package name */
    private static final int f13014h = 21;

    /* renamed from: i, reason: collision with root package name */
    private static final int f13015i = 24;

    /* renamed from: j, reason: collision with root package name */
    private static final int f13016j = 26;

    /* renamed from: a, reason: collision with root package name */
    private final int f13017a = 10;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13018b = true;

    private int a(int i8, byte[] bArr, int i9, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        if (i8 != 0) {
            byte[] a8 = d.a(bArr2, 0, i10);
            int i11 = i10 + i9;
            if (((a8[1] << 8) | a8[0]) == (bArr[i11 + 1] | (bArr[i11] << 8))) {
                return 1;
            }
        } else {
            byte b8 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                b8 = (byte) (b8 + bArr2[i12]);
            }
            if (b8 == bArr2[i10 + i9]) {
                return 1;
            }
        }
        return 0;
    }

    public int a(byte[] bArr, int i8, g gVar) {
        int i9;
        byte b8;
        int i10;
        byte[] a8;
        new Message();
        byte[] bArr2 = new byte[1030];
        byte[] bArr3 = new byte[1];
        byte b9 = 0;
        int i11 = 0;
        boolean z7 = false;
        char c8 = 65535;
        byte b10 = 0;
        while (i11 < 16) {
            byte[] a9 = gVar.a(1);
            if (a9 != null && (b10 = a9[0]) >= 0) {
                int i12 = b10 & 255;
                if (i12 != 21) {
                    if (i12 == 24) {
                        byte[] a10 = gVar.a(1);
                        if (a10 != null && (b10 = a10[0]) == 24) {
                            bArr3[0] = 6;
                            gVar.c(bArr3, 1);
                            gVar.a();
                            return -1;
                        }
                    } else if (i12 == 67) {
                        i11 = 16;
                        z7 = true;
                        c8 = 1;
                    }
                    z7 = false;
                } else {
                    i11 = 16;
                    z7 = true;
                    c8 = 0;
                }
            }
            i11++;
        }
        if (!z7) {
            bArr3[0] = 24;
            gVar.c(bArr3, 1);
            gVar.c(bArr3, 1);
            gVar.c(bArr3, 1);
            gVar.a();
            return -2;
        }
        int i13 = 0;
        byte b11 = 1;
        int i14 = 0;
        while (true) {
            if (this.f13018b) {
                bArr2[b9] = 2;
                i9 = 1024;
            } else {
                bArr2[b9] = 1;
                i9 = 128;
            }
            bArr2[1] = b11;
            bArr2[2] = (byte) (~b11);
            int i15 = i8 - i13;
            if (i15 > i9) {
                i15 = i9;
            }
            if (i15 <= 0) {
                int i16 = 0;
                while (true) {
                    if (i16 >= 10) {
                        b8 = 6;
                        break;
                    }
                    bArr3[0] = 4;
                    gVar.c(bArr3, 1);
                    byte[] a11 = gVar.a(1);
                    if (a11 != null && (b10 = a11[0]) > 0) {
                        b8 = 6;
                        if (b10 == 6) {
                            break;
                        }
                    }
                    i16++;
                }
                gVar.a();
                if (b10 == b8) {
                    return i13;
                }
                return -5;
            }
            int i17 = 3;
            a(bArr2, 3, b9, i15);
            System.arraycopy(bArr, i14, bArr2, 3, i15);
            i14 += i15;
            if (i15 < i9) {
                bArr2[i15 + 3] = 26;
            }
            if (c8 != 0) {
                byte[] a12 = d.a(bArr2, 3, i9);
                bArr2[i9 + 3] = a12[1];
                bArr2[i9 + 4] = a12[b9];
            } else {
                byte b12 = 0;
                while (true) {
                    i10 = i9 + 3;
                    if (i17 >= i10) {
                        break;
                    }
                    b12 = (byte) (b12 + bArr2[i17]);
                    i17++;
                }
                bArr2[i10] = b12;
            }
            int i18 = i13;
            int i19 = 0;
            for (int i20 = 10; i19 < i20; i20 = 10) {
                try {
                    gVar.f13030a.acquire(gVar.f13032c.size());
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
                gVar.f13032c.clear();
                gVar.c(bArr2, i9 + 4 + (c8 != 0 ? 1 : 0));
                byte[] a13 = gVar.a(1);
                if (a13 != null && (b10 = a13[0]) >= 0) {
                    int i21 = b10 & 255;
                    if (i21 == 6) {
                        i18 += i9;
                        b11 = (byte) (b11 + 1);
                        z7 = true;
                        i19 = 10;
                    } else {
                        if (i21 == 24 && (a8 = gVar.a(1)) != null && (b10 = a8[0]) > 0 && b10 == 24) {
                            bArr3[0] = 6;
                            gVar.c(bArr3, 1);
                            gVar.a();
                            return -1;
                        }
                        z7 = false;
                    }
                }
                i19++;
            }
            if (!z7) {
                bArr3[0] = 24;
                gVar.c(bArr3, 1);
                gVar.c(bArr3, 1);
                gVar.c(bArr3, 1);
                gVar.a();
                return -4;
            }
            i13 = i18;
            b9 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0031, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x002f, code lost:
    
        if ((r2 % 128) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if ((r2 % 1024) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        r10 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(byte[] bArr, int i8, g gVar, Handler handler) {
        Message message;
        int i9;
        int i10;
        int i11;
        byte b8;
        int i12;
        int i13;
        byte[] a8;
        c cVar = this;
        int i14 = i8;
        byte[] bArr2 = new byte[1030];
        byte b9 = 1;
        byte[] bArr3 = new byte[1];
        char c8 = 0;
        if (cVar.f13018b) {
            message = new Message();
            message.arg1 = 1002;
            i9 = i14 / 1024;
        } else {
            message = new Message();
            message.arg1 = 1002;
            i9 = i14 / 128;
        }
        message.arg2 = i9 + i10;
        handler.sendMessage(message);
        int i15 = 0;
        boolean z7 = false;
        char c9 = 65535;
        byte b10 = 0;
        while (i15 < 16) {
            byte[] a9 = gVar.a(1);
            if (a9 != null && (b10 = a9[0]) >= 0) {
                int i16 = b10 & 255;
                if (i16 != 21) {
                    if (i16 == 24) {
                        byte[] a10 = gVar.a(1);
                        if (a10 != null && (b10 = a10[0]) == 24) {
                            bArr3[0] = 6;
                            gVar.c(bArr3, 1);
                            gVar.a();
                            return -1;
                        }
                    } else if (i16 == 67) {
                        i15 = 16;
                        z7 = true;
                        c9 = 1;
                    }
                    z7 = false;
                } else {
                    i15 = 16;
                    z7 = true;
                    c9 = 0;
                }
            }
            i15++;
        }
        if (!z7) {
            bArr3[0] = 24;
            gVar.c(bArr3, 1);
            gVar.c(bArr3, 1);
            gVar.c(bArr3, 1);
            gVar.a();
            return -2;
        }
        int i17 = 0;
        int i18 = 1;
        int i19 = 0;
        byte b11 = 1;
        while (true) {
            if (cVar.f13018b) {
                bArr2[c8] = 2;
                i11 = 1024;
            } else {
                bArr2[c8] = b9;
                i11 = 128;
            }
            bArr2[b9] = b11;
            bArr2[2] = (byte) (~b11);
            int i20 = i14 - i17;
            Message message2 = new Message();
            int i21 = i17;
            message2.arg1 = 1003;
            message2.arg2 = i18;
            Log.i("JavaXmodem", "num:" + i18);
            handler.sendMessage(message2);
            if (i20 > i11) {
                i20 = i11;
            }
            if (i20 <= 0) {
                int i22 = 0;
                while (true) {
                    if (i22 >= 10) {
                        b8 = 6;
                        break;
                    }
                    Log.i("JavaXmodem", "send EOT");
                    bArr3[0] = 4;
                    gVar.c(bArr3, 1);
                    byte[] a11 = gVar.a(1);
                    if (a11 != null && (b10 = a11[0]) > 0) {
                        b8 = 6;
                        if (b10 == 6) {
                            break;
                        }
                    }
                    i22++;
                }
                gVar.a();
                if (b10 == b8) {
                    return i21;
                }
                return -5;
            }
            int i23 = 3;
            cVar.a(bArr2, 3, (byte) 0, i20);
            System.arraycopy(bArr, i19, bArr2, 3, i20);
            i19 += i20;
            if (i20 < i11) {
                bArr2[i20 + 3] = 26;
            }
            if (c9 != 0) {
                byte[] a12 = d.a(bArr2, 3, i11);
                bArr2[i11 + 3] = a12[1];
                bArr2[i11 + 4] = a12[0];
            } else {
                byte b12 = 0;
                while (true) {
                    i12 = i11 + 3;
                    if (i23 >= i12) {
                        break;
                    }
                    b12 = (byte) (b12 + bArr2[i23]);
                    i23++;
                }
                bArr2[i12] = b12;
            }
            int i24 = 0;
            while (i24 < 10) {
                try {
                    gVar.f13030a.acquire(gVar.f13032c.size());
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
                gVar.f13032c.clear();
                gVar.c(bArr2, i11 + 4 + (c9 != 0 ? 1 : 0));
                byte[] a13 = gVar.a(1);
                if (a13 == null || (b10 = a13[0]) < 0) {
                    i13 = 1;
                } else {
                    int i25 = b10 & 255;
                    if (i25 != 6) {
                        if (i25 == 21) {
                            Log.i("JavaXmodem", "recv NAK");
                        } else if (i25 == 24 && (a8 = gVar.a(1)) != null && (b10 = a8[0]) > 0 && b10 == 24) {
                            bArr3[0] = 6;
                            gVar.c(bArr3, 1);
                            gVar.a();
                            return -1;
                        }
                        i13 = 1;
                        z7 = false;
                    } else {
                        i18++;
                        i21 += i11;
                        b11 = (byte) (b11 + 1);
                        i24 = 10;
                        i13 = 1;
                        z7 = true;
                    }
                }
                i24 += i13;
            }
            b9 = 1;
            if (!z7) {
                bArr3[0] = 24;
                gVar.c(bArr3, 1);
                gVar.c(bArr3, 1);
                gVar.c(bArr3, 1);
                gVar.a();
                return -4;
            }
            cVar = this;
            i14 = i8;
            i17 = i21;
            c8 = 0;
        }
    }

    private void a(byte[] bArr, int i8, byte b8, int i9) {
        if (bArr.length < i8 + i9) {
            return;
        }
        while (i8 < i9) {
            bArr[i8] = 0;
            i8++;
        }
    }

    public byte[] a(int i8, g gVar) {
        int i9;
        int i10;
        byte[] bArr = new byte[i8];
        byte[] bArr2 = new byte[1030];
        byte[] bArr3 = new byte[1];
        byte[] bArr4 = {67};
        int i11 = 10;
        int i12 = 0;
        int i13 = 0;
        char c8 = 'C';
        byte b8 = 0;
        byte b9 = 1;
        int i14 = 0;
        while (true) {
            int i15 = 0;
            boolean z7 = false;
            while (i15 < 16) {
                if (c8 != 0) {
                    gVar.c(bArr4, 1);
                }
                byte[] a8 = gVar.a(1);
                if (a8 != null && (b8 = a8[0]) >= 0) {
                    int i16 = b8 & 255;
                    if (i16 == 1) {
                        i10 = 1;
                        i15 = 16;
                        i12 = 128;
                    } else if (i16 == 2) {
                        i10 = 1;
                        i15 = 16;
                        i12 = 1024;
                    } else {
                        if (i16 == 4) {
                            gVar.a();
                            bArr3[0] = 6;
                            gVar.c(bArr3, 1);
                            return bArr;
                        }
                        if (i16 == 24) {
                            i10 = 1;
                            byte[] a9 = gVar.a(1);
                            if (a9 != null && (b8 = a9[0]) > 0 && b8 == 24) {
                                gVar.a();
                                bArr3[0] = 6;
                                gVar.c(bArr3, 1);
                                return null;
                            }
                            i15 += i10;
                        }
                    }
                    z7 = true;
                    i15 += i10;
                }
                i10 = 1;
                i15 += i10;
            }
            if (z7) {
                if (c8 == 'C') {
                    i13 = 1;
                }
                bArr2[0] = b8;
                int i17 = i12 + i13 + 3;
                byte[] a10 = gVar.a(i17);
                if (a10 != null) {
                    System.arraycopy(a10, 0, bArr2, 1, i17);
                    byte b10 = bArr2[1];
                    if (b10 == (~bArr2[2]) && (b10 == b9 || b10 == b9 - 1)) {
                        if (a(i13, bArr2, 3, i12) != 0) {
                            if (bArr2[1] == b9) {
                                int i18 = i8 - i14;
                                if (i18 > i12) {
                                    i18 = i12;
                                }
                                if (i18 > 0) {
                                    System.arraycopy(bArr2, 3, bArr, i14, i18);
                                    i14 += i18;
                                }
                                i11 = 11;
                                b9 = (byte) (b9 + 1);
                            }
                            i11--;
                            if (i11 <= 0) {
                                gVar.a();
                                bArr3[0] = 24;
                                gVar.c(bArr3, 1);
                                gVar.c(bArr3, 1);
                                gVar.c(bArr3, 1);
                                return null;
                            }
                            i9 = 1;
                            bArr3[0] = 6;
                            gVar.c(bArr3, i9);
                            c8 = 0;
                        }
                        i9 = 1;
                        gVar.a();
                        bArr3[0] = 21;
                        gVar.c(bArr3, i9);
                        c8 = 0;
                    }
                }
                i9 = 1;
                gVar.a();
                bArr3[0] = 21;
                gVar.c(bArr3, i9);
                c8 = 0;
            } else {
                if (c8 != 'C') {
                    gVar.a();
                    bArr3[0] = 24;
                    gVar.c(bArr3, 1);
                    gVar.c(bArr3, 1);
                    gVar.c(bArr3, 1);
                    return null;
                }
                c8 = 21;
            }
        }
    }
}
