package com.crrepa.band.my.device.worldclock.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.WorldClockModel;
import java.util.List;
import me.yokeyword.indexablerv.d;

/* loaded from: classes2.dex */
public class a extends d {
    private final LayoutInflater inflater;

    /* renamed from: com.crrepa.band.my.device.worldclock.adapter.a$a, reason: collision with other inner class name */
    private static class C0197a extends RecyclerView.ViewHolder {
        TextView tvName;
        View viewLevel1;

        public C0197a(View view) {
            super(view);
            this.tvName = (TextView) view.findViewById(R.id.tv_name);
            this.viewLevel1 = view.findViewById(R.id.view_line);
        }
    }

    private static class b extends RecyclerView.ViewHolder {
        TextView tvTitle;

        public b(View view) {
            super(view);
            this.tvTitle = (TextView) view.findViewById(R.id.tv_title);
        }
    }

    public a(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @Override // me.yokeyword.indexablerv.d
    public void onBindTitleViewHolder(RecyclerView.ViewHolder viewHolder, String str) {
        ((b) viewHolder).tvTitle.setText(str);
    }

    @Override // me.yokeyword.indexablerv.d
    public RecyclerView.ViewHolder onCreateContentViewHolder(ViewGroup viewGroup) {
        return new C0197a(this.inflater.inflate(R.layout.item_select_city_content, viewGroup, false));
    }

    @Override // me.yokeyword.indexablerv.d
    public RecyclerView.ViewHolder onCreateTitleViewHolder(ViewGroup viewGroup) {
        return new b(this.inflater.inflate(R.layout.item_select_contact_title, viewGroup, false));
    }

    @Override // me.yokeyword.indexablerv.d
    public void setDatas(List<WorldClockModel> list) {
        super.setDatas(list);
    }

    @Override // me.yokeyword.indexablerv.d
    public void onBindContentViewHolder(RecyclerView.ViewHolder viewHolder, WorldClockModel worldClockModel) {
        ((C0197a) viewHolder).tvName.setText(worldClockModel.getCity());
    }
}
