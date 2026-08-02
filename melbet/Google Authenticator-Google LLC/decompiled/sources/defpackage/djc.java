package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djc {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[FALL_THROUGH] */
    static {
        int[] a2 = jmy.a();
        int i = 0;
        for (int i2 = 0; i2 < 85; i2++) {
            int i3 = a2[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            i = Math.max(i, i4);
        }
        kcd[] kcdVarArr = new kcd[i + 1];
        int[] a3 = jmy.a();
        for (int i5 = 0; i5 < 85; i5++) {
            int i6 = a3[i5];
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i7 != 17 && i7 != 27 && i7 != 78 && i7 != 82 && i7 != 86) {
                switch (i7) {
                    default:
                        switch (i7) {
                            default:
                                switch (i7) {
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                        break;
                                    default:
                                        switch (i7) {
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 67:
                                            case 68:
                                            case 69:
                                            case 70:
                                            case 71:
                                            case 72:
                                            case 73:
                                                break;
                                            default:
                                                continue;
                                        }
                                }
                            case 19:
                            case 20:
                            case 21:
                                kcd kcdVar = new kcd();
                                kcdVarArr[i7] = kcdVar;
                                int i8 = hel.d;
                                kcdVar.a = his.a;
                                break;
                        }
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case 15:
                        break;
                }
            }
            kcd kcdVar2 = new kcd();
            kcdVarArr[i7] = kcdVar2;
            int i82 = hel.d;
            kcdVar2.a = his.a;
        }
    }
}
