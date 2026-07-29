package android.support.v7.d;

import java.util.Comparator;

/* compiled from: SortedList.java */
/* loaded from: classes.dex */
public class a<T> {

    /* compiled from: SortedList.java */
    /* renamed from: android.support.v7.d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0014a<T2> implements Comparator<T2> {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public abstract void onChanged(int i, int i2);

        public void onChanged(int i, int i2, Object obj) {
            onChanged(i, i2);
        }
    }
}
