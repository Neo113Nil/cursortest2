package a1;

import android.content.res.Resources;
import b0.e1;
import c2.c2;
import com.appsflyer.attribution.RequestError;
import com.manholeroboramprush.cardestroy.data.database.RecipeVault;
import ge.t;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import n4.b0;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18d;

    public /* synthetic */ f(int i3) {
        this.f18d = i3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String valueOf;
        switch (this.f18d) {
            case 0:
                return new j((Map) obj);
            case 1:
                return obj;
            case 2:
                ce.b bVar = (ce.b) obj;
                bVar.getClass();
                return mf.a.a(bVar);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                throw n0.l.e(obj);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                throw n0.l.e(obj);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                throw n0.l.e(obj);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return Unit.f5554a;
            case 9:
                return ((e1) obj).f821c;
            case 10:
                synchronized (b1.r.f1030c) {
                    ?? r02 = b1.r.f1035i;
                    int size = r02.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((Function1) r02.get(i3)).invoke(obj);
                    }
                }
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                return Unit.f5554a;
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) "[");
                    int i10 = 0;
                    for (byte b10 : (byte[]) value) {
                        i10++;
                        if (i10 > 1) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append((CharSequence) String.valueOf((int) b10));
                    }
                    sb2.append((CharSequence) "]");
                    valueOf = sb2.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return v4.a.p(new StringBuilder("  "), ((b4.c) entry.getKey()).f1098a, " = ", valueOf);
            case 13:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 14:
                return Boolean.valueOf(obj == null);
            case 15:
                return Unit.f5554a;
            case 16:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 17:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 18:
                char charValue = ((Character) obj).charValue();
                return Boolean.valueOf(charValue == 'T' || charValue == 't');
            case 19:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 20:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 21:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue2 && charValue2 < ':');
            case 22:
                return Boolean.TRUE;
            case 23:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                b0Var.a(0);
                b0Var.f7035e = true;
                b0Var.f7036f = false;
                return Unit.f5554a;
            case 24:
                ef.a aVar = (ef.a) obj;
                aVar.getClass();
                e eVar = new e(2, (byte) 0);
                hf.b bVar2 = jf.b.f5254e;
                af.b bVar3 = af.b.f373d;
                j0 j0Var = j0.f5574d;
                aVar.a(new cf.d(new af.a(bVar2, c0.a(i9.c.class), eVar, bVar3, j0Var)));
                byte b11 = 0;
                aVar.a(new cf.d(new af.a(bVar2, c0.a(i9.d.class), new e(3, b11), bVar3, j0Var)));
                aVar.a(new cf.d(new af.a(bVar2, c0.a(RecipeVault.class), new e(4, b11), bVar3, j0Var)));
                aVar.a(new cf.d(new af.a(bVar2, c0.a(h9.c.class), new e(5, b11), bVar3, j0Var)));
                g9.a aVar2 = new g9.a(0);
                af.b bVar4 = af.b.f374e;
                aVar.a(new cf.a(new af.a(bVar2, c0.a(s9.a.class), aVar2, bVar4, j0Var)));
                aVar.a(new cf.a(new af.a(bVar2, c0.a(n9.c.class), new g9.a(1), bVar4, j0Var)));
                aVar.a(new cf.a(new af.a(bVar2, c0.a(q9.a.class), new g9.a(2), bVar4, j0Var)));
                aVar.a(new cf.a(new af.a(bVar2, c0.a(t9.c.class), new g9.a(3), bVar4, j0Var)));
                aVar.a(new cf.a(new af.a(bVar2, c0.a(f9.a.class), new g9.a(4), bVar4, j0Var)));
                aVar.a(new cf.d(new af.a(bVar2, c0.a(k9.a.class), new e(6, (byte) 0), bVar3, j0Var)));
                return Unit.f5554a;
            case 25:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof t) {
                    return (t) element;
                }
                return null;
            case 26:
                i5.a aVar3 = (i5.a) obj;
                aVar3.getClass();
                i5.c K = aVar3.K("SELECT * FROM high_scores WHERE score > 0 ORDER BY score DESC");
                try {
                    int O = i7.a.O(K, "id");
                    int O2 = i7.a.O(K, "date");
                    int O3 = i7.a.O(K, "score");
                    ArrayList arrayList = new ArrayList();
                    while (K.E()) {
                        arrayList.add(new h9.a(K.k(O2), (int) K.getLong(O), (int) K.getLong(O3)));
                    }
                    return arrayList;
                } finally {
                    K.close();
                }
            case 27:
                return Unit.f5554a;
            case 28:
                ((c2) obj).getClass();
                throw new ClassCastException();
            default:
                ((c2) obj).getClass();
                throw new ClassCastException();
        }
    }
}
