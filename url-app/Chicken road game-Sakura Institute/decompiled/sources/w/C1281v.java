package w;

import A0.C0036g;
import G0.C0237a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1441y;

/* renamed from: w.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281v extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11353e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P f11354i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G0.y f11355j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1281v(boolean z4, boolean z5, P p4, y0.i iVar, G0.y yVar) {
        super(1);
        this.f11352d = z4;
        this.f11353e = z5;
        this.f11354i = p4;
        this.f11355j = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0036g replacement = (C0036g) obj;
        if (this.f11352d || !this.f11353e) {
            return Boolean.FALSE;
        }
        P p4 = this.f11354i;
        G0.E e4 = p4.f11058e;
        C1277q c1277q = p4.f11073t;
        Unit unit = null;
        if (e4 != null) {
            G0.y i2 = p4.f11057d.i(C1441y.e(new G0.k(), new C0237a(replacement, 1)));
            e4.a(null, i2);
            c1277q.invoke(i2);
            unit = Unit.f7487a;
        }
        if (unit == null) {
            G0.y yVar = this.f11355j;
            String str = yVar.f3093a.f328a;
            int i4 = A0.K.f300c;
            long j4 = yVar.f3094b;
            int i5 = (int) (j4 >> 32);
            int i6 = (int) (j4 & 4294967295L);
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(replacement, "replacement");
            if (i6 < i5) {
                throw new IndexOutOfBoundsException("End index (" + i6 + ") is less than start index (" + i5 + ").");
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) str, 0, i5);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append((CharSequence) replacement);
            sb.append((CharSequence) str, i6, str.length());
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            String obj2 = sb.toString();
            int length = replacement.f328a.length() + i5;
            c1277q.invoke(new G0.y(4, M1.a.j(length, length), obj2));
        }
        return Boolean.TRUE;
    }
}
