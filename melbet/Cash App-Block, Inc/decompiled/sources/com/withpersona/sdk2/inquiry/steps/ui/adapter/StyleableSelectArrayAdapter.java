package com.withpersona.sdk2.inquiry.steps.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import androidx.cursoradapter.widget.CursorFilter;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import java.util.List;
import kotlin.collections.EmptySet;

/* loaded from: classes4.dex */
public final class StyleableSelectArrayAdapter extends ArrayAdapter {
    public final List objects;
    public final TextBasedComponentStyle textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleableSelectArrayAdapter(Context context, int i, List list, TextBasedComponentStyle textBasedComponentStyle) {
        super(context, i, list);
        context.getClass();
        list.getClass();
        this.objects = list;
        this.textStyle = textBasedComponentStyle;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new CursorFilter(this, 2);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        View view2 = super.getView(i, view, viewGroup);
        view2.getClass();
        TextBasedComponentStyle textBasedComponentStyle = this.textStyle;
        if (textBasedComponentStyle != null) {
            TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
            if (textView != null) {
                TextStylingKt.style(textView, textBasedComponentStyle, EmptySet.INSTANCE);
            }
        }
        return view2;
    }
}
