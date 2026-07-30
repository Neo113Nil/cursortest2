package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes4.dex */
public class SwipeMenuView extends LinearLayout implements View.OnClickListener {
    private g mItemClickListener;
    private RecyclerView.ViewHolder mViewHolder;

    public SwipeMenuView(Context context) {
        this(context, null);
    }

    private ImageView createIcon(l lVar) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(lVar.getImage());
        return imageView;
    }

    private TextView createTitle(l lVar) {
        TextView textView = new TextView(getContext());
        textView.setText(lVar.getText());
        textView.setGravity(17);
        int textSize = lVar.getTextSize();
        if (textSize > 0) {
            textView.setTextSize(2, textSize);
        }
        ColorStateList titleColor = lVar.getTitleColor();
        if (titleColor != null) {
            textView.setTextColor(titleColor);
        }
        int textAppearance = lVar.getTextAppearance();
        if (textAppearance != 0) {
            TextViewCompat.setTextAppearance(textView, textAppearance);
        }
        Typeface textTypeface = lVar.getTextTypeface();
        if (textTypeface != null) {
            textView.setTypeface(textTypeface);
        }
        return textView;
    }

    public void createMenu(RecyclerView.ViewHolder viewHolder, i iVar, b bVar, int i8, g gVar) {
        removeAllViews();
        this.mViewHolder = viewHolder;
        this.mItemClickListener = gVar;
        List<l> menuItems = iVar.getMenuItems();
        for (int i9 = 0; i9 < menuItems.size(); i9++) {
            l lVar = menuItems.get(i9);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(lVar.getWidth(), lVar.getHeight());
            layoutParams.weight = lVar.getWeight();
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setId(i9);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            ViewCompat.setBackground(linearLayout, lVar.getBackground());
            linearLayout.setOnClickListener(this);
            addView(linearLayout);
            linearLayout.setTag(new j(bVar, i8, i9));
            if (lVar.getImage() != null) {
                linearLayout.addView(createIcon(lVar));
            }
            if (!TextUtils.isEmpty(lVar.getText())) {
                linearLayout.addView(createTitle(lVar));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g gVar = this.mItemClickListener;
        if (gVar != null) {
            gVar.onItemClick((j) view.getTag(), this.mViewHolder.getAdapterPosition());
        }
    }

    public SwipeMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeMenuView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        setGravity(16);
    }
}
