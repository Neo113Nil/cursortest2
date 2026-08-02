package W0;

import E.AbstractC0005f;
import W.AbstractC0108a;
import W.AbstractC0110c;
import W.t;
import W.u;
import a.AbstractC0124a;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: h, reason: collision with root package name */
    public final u f3445h = new u();

    /* renamed from: i, reason: collision with root package name */
    public final t f3446i = new t();

    /* renamed from: j, reason: collision with root package name */
    public int f3447j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final int f3448k;

    /* renamed from: l, reason: collision with root package name */
    public final e[] f3449l;

    /* renamed from: m, reason: collision with root package name */
    public e f3450m;
    public List n;
    public List o;

    /* renamed from: p, reason: collision with root package name */
    public t f3451p;

    /* renamed from: q, reason: collision with root package name */
    public int f3452q;

    public f(int i4, List list) {
        this.f3448k = i4 == -1 ? 1 : i4;
        if (list != null) {
            byte[] bArr = AbstractC0110c.f3295a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b4 = ((byte[]) list.get(0))[0];
            }
        }
        this.f3449l = new e[8];
        for (int i5 = 0; i5 < 8; i5++) {
            this.f3449l[i5] = new e();
        }
        this.f3450m = this.f3449l[0];
    }

    @Override // W0.h
    public final t1.h f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new t1.h(22, list);
    }

    @Override // W0.h, Z.c
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.f3452q = 0;
        this.f3450m = this.f3449l[0];
        l();
        this.f3451p = null;
    }

    @Override // W0.h
    public final void g(g gVar) {
        ByteBuffer byteBuffer = gVar.f3781e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        u uVar = this.f3445h;
        uVar.K(limit, array);
        while (uVar.a() >= 3) {
            int z = uVar.z();
            int i4 = z & 3;
            boolean z4 = (z & 4) == 4;
            byte z5 = (byte) uVar.z();
            byte z6 = (byte) uVar.z();
            if (i4 == 2 || i4 == 3) {
                if (z4) {
                    if (i4 == 3) {
                        j();
                        int i5 = (z5 & 192) >> 6;
                        int i6 = this.f3447j;
                        if (i6 != -1 && i5 != (i6 + 1) % 4) {
                            l();
                            AbstractC0108a.s("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f3447j + " current=" + i5);
                        }
                        this.f3447j = i5;
                        int i7 = z5 & 63;
                        if (i7 == 0) {
                            i7 = 64;
                        }
                        t tVar = new t(i5, i7);
                        this.f3451p = tVar;
                        byte[] bArr = tVar.f3345d;
                        tVar.f3346e = 1;
                        bArr[0] = z6;
                    } else {
                        AbstractC0124a.h(i4 == 2);
                        t tVar2 = this.f3451p;
                        if (tVar2 == null) {
                            AbstractC0108a.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = tVar2.f3345d;
                            int i8 = tVar2.f3346e;
                            int i9 = i8 + 1;
                            tVar2.f3346e = i9;
                            bArr2[i8] = z5;
                            tVar2.f3346e = i8 + 2;
                            bArr2[i9] = z6;
                        }
                    }
                    t tVar3 = this.f3451p;
                    if (tVar3.f3346e == (tVar3.f3344c * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // W0.h
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        char c4;
        int i4;
        boolean z;
        t tVar = this.f3451p;
        if (tVar == null) {
            return;
        }
        int i5 = 2;
        if (tVar.f3346e != (tVar.f3344c * 2) - 1) {
            AbstractC0108a.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f3451p.f3344c * 2) - 1) + ", but current index is " + this.f3451p.f3346e + " (sequence number " + this.f3451p.f3343b + ");");
        }
        t tVar2 = this.f3451p;
        byte[] bArr = tVar2.f3345d;
        int i6 = tVar2.f3346e;
        t tVar3 = this.f3446i;
        tVar3.o(i6, bArr);
        boolean z4 = false;
        while (true) {
            if (tVar3.b() > 0) {
                int i7 = 3;
                int i8 = tVar3.i(3);
                int i9 = tVar3.i(5);
                if (i8 == 7) {
                    tVar3.t(i5);
                    i8 = tVar3.i(6);
                    if (i8 < 7) {
                        AbstractC0005f.u(i8, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i9 == 0) {
                    if (i8 != 0) {
                        AbstractC0108a.s("Cea708Decoder", "serviceNumber is non-zero (" + i8 + ") when blockSize is 0");
                    }
                } else if (i8 != this.f3448k) {
                    tVar3.u(i9);
                } else {
                    int g4 = (i9 * 8) + tVar3.g();
                    while (tVar3.g() < g4) {
                        int i10 = tVar3.i(8);
                        if (i10 != 16) {
                            if (i10 <= 31) {
                                if (i10 != 0) {
                                    if (i10 == i7) {
                                        this.n = k();
                                    } else if (i10 != 8) {
                                        switch (i10) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.f3450m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i10 < 17 || i10 > 23) {
                                                    if (i10 < 24 || i10 > 31) {
                                                        AbstractC0005f.u(i10, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        AbstractC0108a.s("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                                                        tVar3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC0108a.s("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                                                    tVar3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f3450m.f3427b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i4 = i5;
                            } else if (i10 <= 127) {
                                if (i10 == 127) {
                                    this.f3450m.a((char) 9835);
                                } else {
                                    this.f3450m.a((char) (i10 & KotlinVersion.MAX_COMPONENT_VALUE));
                                }
                                i4 = i5;
                                z4 = true;
                            } else {
                                if (i10 <= 159) {
                                    e[] eVarArr = this.f3449l;
                                    switch (i10) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i11 = i10 - 128;
                                            if (this.f3452q != i11) {
                                                this.f3452q = i11;
                                                this.f3450m = eVarArr[i11];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (tVar3.h()) {
                                                    e eVar = eVarArr[8 - i12];
                                                    eVar.f3426a.clear();
                                                    eVar.f3427b.clear();
                                                    eVar.o = -1;
                                                    eVar.f3439p = -1;
                                                    eVar.f3440q = -1;
                                                    eVar.f3442s = -1;
                                                    eVar.f3444u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (tVar3.h()) {
                                                    eVarArr[8 - i13].f3429d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (tVar3.h()) {
                                                    eVarArr[8 - i14].f3429d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (tVar3.h()) {
                                                    eVarArr[8 - i15].f3429d = !r1.f3429d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (tVar3.h()) {
                                                    eVarArr[8 - i16].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            tVar3.t(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            l();
                                            z = true;
                                            break;
                                        case 144:
                                            int i17 = i5;
                                            if (!this.f3450m.f3428c) {
                                                tVar3.t(16);
                                                z = true;
                                                i7 = 3;
                                                break;
                                            } else {
                                                tVar3.i(4);
                                                tVar3.i(i17);
                                                tVar3.i(i17);
                                                boolean h2 = tVar3.h();
                                                boolean h4 = tVar3.h();
                                                i7 = 3;
                                                tVar3.i(3);
                                                tVar3.i(3);
                                                this.f3450m.e(h2, h4);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.f3450m.f3428c) {
                                                int c5 = e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), tVar3.i(2));
                                                int c6 = e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), tVar3.i(2));
                                                tVar3.t(2);
                                                e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), 0);
                                                this.f3450m.f(c5, c6);
                                            } else {
                                                tVar3.t(24);
                                            }
                                            z = true;
                                            i7 = 3;
                                            break;
                                        case 146:
                                            if (this.f3450m.f3428c) {
                                                tVar3.t(4);
                                                int i18 = tVar3.i(4);
                                                tVar3.t(2);
                                                tVar3.i(6);
                                                e eVar2 = this.f3450m;
                                                if (eVar2.f3444u != i18) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f3444u = i18;
                                            } else {
                                                tVar3.t(16);
                                            }
                                            z = true;
                                            i7 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0005f.u(i10, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.f3450m.f3428c) {
                                                int c7 = e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), tVar3.i(2));
                                                tVar3.i(2);
                                                e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), 0);
                                                tVar3.h();
                                                tVar3.h();
                                                tVar3.i(2);
                                                tVar3.i(2);
                                                int i19 = tVar3.i(2);
                                                tVar3.t(8);
                                                e eVar3 = this.f3450m;
                                                eVar3.n = c7;
                                                eVar3.f3436k = i19;
                                            } else {
                                                tVar3.t(32);
                                            }
                                            z = true;
                                            i7 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i20 = i10 - 152;
                                            e eVar4 = eVarArr[i20];
                                            tVar3.t(i5);
                                            boolean h5 = tVar3.h();
                                            tVar3.t(i5);
                                            int i21 = tVar3.i(i7);
                                            boolean h6 = tVar3.h();
                                            int i22 = tVar3.i(7);
                                            int i23 = tVar3.i(8);
                                            int i24 = tVar3.i(4);
                                            int i25 = tVar3.i(4);
                                            tVar3.t(i5);
                                            tVar3.t(6);
                                            tVar3.t(i5);
                                            int i26 = tVar3.i(3);
                                            int i27 = tVar3.i(3);
                                            ArrayList arrayList = eVar4.f3426a;
                                            eVar4.f3428c = true;
                                            eVar4.f3429d = h5;
                                            eVar4.f3430e = i21;
                                            eVar4.f3431f = h6;
                                            eVar4.f3432g = i22;
                                            eVar4.f3433h = i23;
                                            eVar4.f3434i = i24;
                                            int i28 = i25 + 1;
                                            if (eVar4.f3435j != i28) {
                                                eVar4.f3435j = i28;
                                                while (true) {
                                                    if (arrayList.size() >= eVar4.f3435j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i26 != 0 && eVar4.f3437l != i26) {
                                                eVar4.f3437l = i26;
                                                int i29 = i26 - 1;
                                                int i30 = e.f3419B[i29];
                                                boolean z5 = e.f3418A[i29];
                                                int i31 = e.f3425y[i29];
                                                int i32 = e.z[i29];
                                                int i33 = e.f3424x[i29];
                                                eVar4.n = i30;
                                                eVar4.f3436k = i33;
                                            }
                                            if (i27 != 0 && eVar4.f3438m != i27) {
                                                eVar4.f3438m = i27;
                                                int i34 = i27 - 1;
                                                int i35 = e.f3421D[i34];
                                                int i36 = e.f3420C[i34];
                                                eVar4.e(false, false);
                                                eVar4.f(e.v, e.f3422E[i34]);
                                            }
                                            if (this.f3452q != i20) {
                                                this.f3452q = i20;
                                                this.f3450m = eVarArr[i20];
                                            }
                                            z = true;
                                            i7 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (i10 <= 255) {
                                        this.f3450m.a((char) (i10 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        AbstractC0005f.u(i10, "Invalid base command: ", "Cea708Decoder");
                                        i4 = 2;
                                        c4 = 7;
                                    }
                                }
                                z4 = z;
                                i4 = 2;
                                c4 = 7;
                            }
                            c4 = 7;
                        } else {
                            int i37 = tVar3.i(8);
                            if (i37 <= 31) {
                                c4 = 7;
                                if (i37 > 7) {
                                    if (i37 <= 15) {
                                        tVar3.t(8);
                                    } else if (i37 <= 23) {
                                        tVar3.t(16);
                                    } else if (i37 <= 31) {
                                        tVar3.t(24);
                                    }
                                }
                            } else {
                                c4 = 7;
                                if (i37 <= 127) {
                                    if (i37 == 32) {
                                        this.f3450m.a(' ');
                                    } else if (i37 == 33) {
                                        this.f3450m.a((char) 160);
                                    } else if (i37 == 37) {
                                        this.f3450m.a((char) 8230);
                                    } else if (i37 == 42) {
                                        this.f3450m.a((char) 352);
                                    } else if (i37 == 44) {
                                        this.f3450m.a((char) 338);
                                    } else if (i37 == 63) {
                                        this.f3450m.a((char) 376);
                                    } else if (i37 == 57) {
                                        this.f3450m.a((char) 8482);
                                    } else if (i37 == 58) {
                                        this.f3450m.a((char) 353);
                                    } else if (i37 == 60) {
                                        this.f3450m.a((char) 339);
                                    } else if (i37 != 61) {
                                        switch (i37) {
                                            case 48:
                                                this.f3450m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f3450m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f3450m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f3450m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f3450m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f3450m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i37) {
                                                    case 118:
                                                        this.f3450m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f3450m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f3450m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f3450m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f3450m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f3450m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f3450m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f3450m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f3450m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f3450m.a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC0005f.u(i37, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f3450m.a((char) 8480);
                                    }
                                    i4 = 2;
                                    z4 = true;
                                } else if (i37 > 159) {
                                    i4 = 2;
                                    if (i37 <= 255) {
                                        if (i37 == 160) {
                                            this.f3450m.a((char) 13252);
                                        } else {
                                            AbstractC0005f.u(i37, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f3450m.a('_');
                                        }
                                        z4 = true;
                                    } else {
                                        AbstractC0005f.u(i37, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i37 <= 135) {
                                    tVar3.t(32);
                                } else if (i37 <= 143) {
                                    tVar3.t(40);
                                } else if (i37 <= 159) {
                                    i4 = 2;
                                    tVar3.t(2);
                                    tVar3.t(tVar3.i(6) * 8);
                                }
                            }
                            i4 = 2;
                        }
                        i5 = i4;
                    }
                }
            }
        }
        if (z4) {
            this.n = k();
        }
        this.f3451p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k() {
        d dVar;
        Layout.Alignment alignment;
        float f4;
        float f5;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            e[] eVarArr = this.f3449l;
            e eVar = eVarArr[i7];
            if (eVar.f3428c && (!eVar.f3426a.isEmpty() || eVar.f3427b.length() != 0)) {
                e eVar2 = eVarArr[i7];
                if (eVar2.f3429d) {
                    ArrayList arrayList2 = eVar2.f3426a;
                    if (!eVar2.f3428c || (arrayList2.isEmpty() && eVar2.f3427b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i8));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i9 = eVar2.f3436k;
                        if (i9 != 0) {
                            if (i9 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i9 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i9 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f3436k);
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (eVar2.f3431f) {
                                f4 = eVar2.f3433h / 209.0f;
                                f5 = eVar2.f3432g / 74.0f;
                            } else {
                                f4 = eVar2.f3433h / 99.0f;
                                f5 = eVar2.f3432g / 99.0f;
                            }
                            float f6 = (f4 * 0.9f) + 0.05f;
                            float f7 = (f5 * 0.9f) + 0.05f;
                            int i10 = eVar2.f3434i;
                            i4 = i10 / 3;
                            if (i4 != 0) {
                                i5 = i10;
                                i6 = 0;
                            } else if (i4 == 1) {
                                i5 = i10;
                                i6 = 1;
                            } else {
                                i5 = i10;
                                i6 = 2;
                            }
                            int i11 = i5 % 3;
                            int i12 = i11 != 0 ? 0 : i11 == 1 ? 1 : 2;
                            int i13 = eVar2.n;
                            dVar = new d(spannableStringBuilder, alignment2, f7, i6, f6, i12, i13 == e.f3423w, i13, eVar2.f3430e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (eVar2.f3431f) {
                        }
                        float f62 = (f4 * 0.9f) + 0.05f;
                        float f72 = (f5 * 0.9f) + 0.05f;
                        int i102 = eVar2.f3434i;
                        i4 = i102 / 3;
                        if (i4 != 0) {
                        }
                        int i112 = i5 % 3;
                        if (i112 != 0) {
                        }
                        int i132 = eVar2.n;
                        dVar = new d(spannableStringBuilder, alignment22, f72, i6, f62, i12, i132 == e.f3423w, i132, eVar2.f3430e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f3415c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            arrayList3.add(((d) arrayList.get(i14)).f3416a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i4 = 0; i4 < 8; i4++) {
            this.f3449l[i4].d();
        }
    }
}
