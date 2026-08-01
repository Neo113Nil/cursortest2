package dev.cct.translatorapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomListAdapter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Ldev/cct/translatorapp/adapter/CustomListAdapter;", "Landroid/widget/ArrayAdapter;", "Ldev/cct/translatorapp/LanguageListModel;", "context", "Landroid/content/Context;", "resource", "", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;ILjava/util/ArrayList;)V", "getCustomView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "getDropDownView", "getView", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomListAdapter extends ArrayAdapter<LanguageListModel> {
    private final ArrayList<LanguageListModel> dataList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomListAdapter(Context context, int i, ArrayList<LanguageListModel> dataList) {
        super(context, i, dataList);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return getCustomView(position, convertView, parent);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return getCustomView(position, convertView, parent);
    }

    private final View getCustomView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinner_items, parent, false);
        }
        Intrinsics.checkNotNull(convertView);
        View findViewById = convertView.findViewById(R.id.langName);
        Intrinsics.checkNotNullExpressionValue(findViewById, "itemView!!.findViewById(R.id.langName)");
        ((TextView) findViewById).setText(getContext().getString(this.dataList.get(position).getLangName()));
        return convertView;
    }
}
