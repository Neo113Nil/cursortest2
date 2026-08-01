package com.trembin.nirefon.betfury.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.trembin.nirefon.betfury.R;
import defpackage.bd0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ItemNoteBinding {
    public final ImageView ivPin;
    public final ImageView ivReminder;
    public final View priorityStrip;
    private final MaterialCardView rootView;
    public final TextView tvContent;
    public final TextView tvDate;
    public final TextView tvPriorityLabel;
    public final TextView tvTitle;

    private ItemNoteBinding(MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = materialCardView;
        this.ivPin = imageView;
        this.ivReminder = imageView2;
        this.priorityStrip = view;
        this.tvContent = textView;
        this.tvDate = textView2;
        this.tvPriorityLabel = textView3;
        this.tvTitle = textView4;
    }

    public static ItemNoteBinding bind(View view) {
        int i = R.id.ivPin;
        ImageView imageView = (ImageView) bd0.d(view, R.id.ivPin);
        if (imageView != null) {
            i = R.id.ivReminder;
            ImageView imageView2 = (ImageView) bd0.d(view, R.id.ivReminder);
            if (imageView2 != null) {
                i = R.id.priorityStrip;
                View d = bd0.d(view, R.id.priorityStrip);
                if (d != null) {
                    i = R.id.tvContent;
                    TextView textView = (TextView) bd0.d(view, R.id.tvContent);
                    if (textView != null) {
                        i = R.id.tvDate;
                        TextView textView2 = (TextView) bd0.d(view, R.id.tvDate);
                        if (textView2 != null) {
                            i = R.id.tvPriorityLabel;
                            TextView textView3 = (TextView) bd0.d(view, R.id.tvPriorityLabel);
                            if (textView3 != null) {
                                i = R.id.tvTitle;
                                TextView textView4 = (TextView) bd0.d(view, R.id.tvTitle);
                                if (textView4 != null) {
                                    return new ItemNoteBinding((MaterialCardView) view, imageView, imageView2, d, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_note, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
