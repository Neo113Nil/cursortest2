package m2;

import java.util.Comparator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6444d;

    public /* synthetic */ d(int i3) {
        this.f6444d = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6444d) {
        }
        return Integer.valueOf(((c) obj).f6440b).compareTo(Integer.valueOf(((c) obj2).f6440b));
    }
}
