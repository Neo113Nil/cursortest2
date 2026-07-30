package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemCricketGameBinding implements ViewBinding {

    @NonNull
    public final RecyclerView rcvGameList;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCricketDate;

    private ItemCricketGameBinding(@NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.rcvGameList = recyclerView;
        this.tvCricketDate = textView;
    }

    @NonNull
    public static ItemCricketGameBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_game_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_game_list);
        if (recyclerView != null) {
            i8 = R.id.tv_cricket_date;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cricket_date);
            if (textView != null) {
                return new ItemCricketGameBinding((RelativeLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemCricketGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemCricketGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_cricket_game, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
