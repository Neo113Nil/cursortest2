package A1;

import G.C0205j0;
import G.InterfaceC0191c0;
import com.appsflyer.attribution.RequestError;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import z1.AbstractC1366J;
import z1.C1391q;

/* renamed from: A1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0058h implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f607e;

    public /* synthetic */ C0058h(int i2, InterfaceC0191c0 interfaceC0191c0) {
        this.f606d = i2;
        this.f607e = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2 = 0;
        InterfaceC0191c0 interfaceC0191c0 = this.f607e;
        switch (this.f606d) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                interfaceC0191c0.setValue(it);
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                interfaceC0191c0.setValue(it2);
                break;
            case 2:
                String it3 = (String) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                interfaceC0191c0.setValue(it3);
                break;
            case 3:
                String it4 = (String) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                interfaceC0191c0.setValue(it4);
                break;
            case 4:
                r.g LazyColumn = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                List list = ((C1391q) interfaceC0191c0.getValue()).f11905c;
                LazyColumn.b(list.size(), new W(1, list), new O.a(-632812321, true, new C0067l0(0, list)));
                break;
            case 5:
                String it5 = (String) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                C1391q c1391q = (C1391q) interfaceC0191c0.getValue();
                c1391q.getClass();
                Intrinsics.checkNotNullParameter(it5, "<set-?>");
                c1391q.f11906d = it5;
                AbstractC1366J.b();
                break;
            case 6:
                String it6 = (String) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                StringBuilder sb = new StringBuilder();
                int length = it6.length();
                while (i2 < length) {
                    char charAt = it6.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                    i2++;
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                C0205j0 c0205j0 = AbstractC0071n0.f634a;
                interfaceC0191c0.setValue(sb2);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C0205j0 c0205j02 = AbstractC0071n0.f634a;
                interfaceC0191c0.setValue(bool);
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                String it7 = (String) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                C0205j0 c0205j03 = AbstractC0071n0.f634a;
                interfaceC0191c0.setValue(it7);
                break;
            case AbstractC1024c.f9242c /* 9 */:
                String it8 = (String) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                C0205j0 c0205j04 = AbstractC0071n0.f634a;
                interfaceC0191c0.setValue(it8);
                break;
            case 10:
                String it9 = (String) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                C0205j0 c0205j05 = AbstractC0071n0.f634a;
                interfaceC0191c0.setValue(it9);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                String it10 = (String) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                interfaceC0191c0.setValue(it10);
                break;
            case 12:
                String it11 = (String) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                interfaceC0191c0.setValue(it11);
                break;
            case 13:
                String it12 = (String) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                interfaceC0191c0.setValue(it12);
                break;
            case 14:
                String it13 = (String) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                interfaceC0191c0.setValue(it13);
                break;
            case AbstractC1024c.f9246g /* 15 */:
                String it14 = (String) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                interfaceC0191c0.setValue(it14);
                break;
            case 16:
                String it15 = (String) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                interfaceC0191c0.setValue(it15);
                break;
            case 17:
                String it16 = (String) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                interfaceC0191c0.setValue(it16);
                break;
            case 18:
                String it17 = (String) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                StringBuilder sb3 = new StringBuilder();
                int length2 = it17.length();
                while (i2 < length2) {
                    char charAt2 = it17.charAt(i2);
                    if (Character.isDigit(charAt2)) {
                        sb3.append(charAt2);
                    }
                    i2++;
                }
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                interfaceC0191c0.setValue(sb4);
                break;
            case 19:
                String it18 = (String) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                StringBuilder sb5 = new StringBuilder();
                int length3 = it18.length();
                while (i2 < length3) {
                    char charAt3 = it18.charAt(i2);
                    if (Character.isDigit(charAt3)) {
                        sb5.append(charAt3);
                    }
                    i2++;
                }
                String sb6 = sb5.toString();
                Intrinsics.checkNotNullExpressionValue(sb6, "toString(...)");
                interfaceC0191c0.setValue(kotlin.text.A.P(4, sb6));
                break;
            case 20:
                String it19 = (String) obj;
                Intrinsics.checkNotNullParameter(it19, "it");
                interfaceC0191c0.setValue(it19);
                break;
            case 21:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                interfaceC0191c0.setValue(bool2);
                break;
            case 22:
                String it20 = (String) obj;
                Intrinsics.checkNotNullParameter(it20, "it");
                interfaceC0191c0.setValue(it20);
                break;
            case 23:
                String it21 = (String) obj;
                Intrinsics.checkNotNullParameter(it21, "it");
                interfaceC0191c0.setValue(it21);
                break;
            case 24:
                String it22 = (String) obj;
                Intrinsics.checkNotNullParameter(it22, "it");
                SimpleDateFormat simpleDateFormat = R0.f534a;
                interfaceC0191c0.setValue(it22);
                break;
            case 25:
                String it23 = (String) obj;
                Intrinsics.checkNotNullParameter(it23, "it");
                StringBuilder sb7 = new StringBuilder();
                int length4 = it23.length();
                while (i2 < length4) {
                    char charAt4 = it23.charAt(i2);
                    if (Character.isDigit(charAt4) || charAt4 == '.') {
                        sb7.append(charAt4);
                    }
                    i2++;
                }
                String sb8 = sb7.toString();
                Intrinsics.checkNotNullExpressionValue(sb8, "toString(...)");
                SimpleDateFormat simpleDateFormat2 = R0.f534a;
                interfaceC0191c0.setValue(sb8);
                break;
            case 26:
                String it24 = (String) obj;
                Intrinsics.checkNotNullParameter(it24, "it");
                StringBuilder sb9 = new StringBuilder();
                int length5 = it24.length();
                while (i2 < length5) {
                    char charAt5 = it24.charAt(i2);
                    if (Character.isDigit(charAt5)) {
                        sb9.append(charAt5);
                    }
                    i2++;
                }
                String sb10 = sb9.toString();
                Intrinsics.checkNotNullExpressionValue(sb10, "toString(...)");
                String P3 = kotlin.text.A.P(3, sb10);
                SimpleDateFormat simpleDateFormat3 = R0.f534a;
                interfaceC0191c0.setValue(P3);
                break;
            case 27:
                String it25 = (String) obj;
                Intrinsics.checkNotNullParameter(it25, "it");
                StringBuilder sb11 = new StringBuilder();
                int length6 = it25.length();
                while (i2 < length6) {
                    char charAt6 = it25.charAt(i2);
                    if (Character.isDigit(charAt6)) {
                        sb11.append(charAt6);
                    }
                    i2++;
                }
                String sb12 = sb11.toString();
                Intrinsics.checkNotNullExpressionValue(sb12, "toString(...)");
                String P4 = kotlin.text.A.P(2, sb12);
                SimpleDateFormat simpleDateFormat4 = R0.f534a;
                interfaceC0191c0.setValue(P4);
                break;
            default:
                String it26 = (String) obj;
                Intrinsics.checkNotNullParameter(it26, "it");
                SimpleDateFormat simpleDateFormat5 = R0.f534a;
                interfaceC0191c0.setValue(it26);
                break;
        }
        return Unit.f7487a;
    }
}
