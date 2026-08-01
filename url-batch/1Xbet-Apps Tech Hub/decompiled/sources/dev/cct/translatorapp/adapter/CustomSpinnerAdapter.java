package dev.cct.translatorapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomSpinnerAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Ldev/cct/translatorapp/adapter/CustomSpinnerAdapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", "resource", "", "objects", "", "maxHeight", "(Landroid/content/Context;ILjava/util/List;I)V", "getDropDownView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "getView", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomSpinnerAdapter extends ArrayAdapter<String> {
    private final int maxHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSpinnerAdapter(Context context, int i, List<String> objects, int i2) {
        super(context, i, objects);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(objects, "objects");
        this.maxHeight = i2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = super.getView(position, convertView, parent);
        Intrinsics.checkNotNullExpressionValue(view, "super.getView(position, convertView, parent)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.maxHeight;
        view.setLayoutParams(layoutParams);
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = super.getDropDownView(position, convertView, parent);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.maxHeight;
        view.setLayoutParams(layoutParams);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return view;
    }
}
