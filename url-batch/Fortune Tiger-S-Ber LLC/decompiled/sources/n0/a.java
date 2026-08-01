package n0;

import androidx.fragment.app.w0;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2937a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2938b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2939d;

    public a(d dVar, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f2937a = arrayList2;
        if (arrayList.size() > 0) {
            throw w0.d(arrayList, 0);
        }
        if (arrayList.size() > 0) {
            throw w0.d(arrayList, 0);
        }
        ArrayList arrayList3 = dVar.f2943b;
        if (!arrayList3.contains(this)) {
            arrayList3.add(this);
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                throw w0.d(arrayList2, size);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw w0.d(arrayList2, size2);
            }
        }
        this.f2938b = dVar;
    }
}
