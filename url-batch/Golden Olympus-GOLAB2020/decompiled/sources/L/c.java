package L;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    private int f896i;

    /* renamed from: j, reason: collision with root package name */
    private int f897j;

    /* renamed from: k, reason: collision with root package name */
    private LayoutInflater f898k;

    public c(Context context, int i4, Cursor cursor, boolean z4) {
        super(context, cursor, z4);
        this.f897j = i4;
        this.f896i = i4;
        this.f898k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // L.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f898k.inflate(this.f897j, viewGroup, false);
    }

    @Override // L.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f898k.inflate(this.f896i, viewGroup, false);
    }
}
