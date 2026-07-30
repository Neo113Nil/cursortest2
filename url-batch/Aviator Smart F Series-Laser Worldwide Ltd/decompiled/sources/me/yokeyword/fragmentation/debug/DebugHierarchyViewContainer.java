package me.yokeyword.fragmentation.debug;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import java.util.List;
import me.yokeyword.fragmentation.R$drawable;
import me.yokeyword.fragmentation.R$id;
import me.yokeyword.fragmentation.R$string;

/* loaded from: classes5.dex */
public class DebugHierarchyViewContainer extends ScrollView {
    private Context mContext;
    private int mItemHeight;
    private LinearLayout mLinearLayout;
    private int mPadding;
    private LinearLayout mTitleLayout;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toast.makeText(DebugHierarchyViewContainer.this.mContext, R$string.fragmentation_stack_help, 1).show();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ List val$childFragmentRecord;
        final /* synthetic */ TextView val$childTvItem;
        final /* synthetic */ int val$finalChilHierarchy;

        b(TextView textView, int i8, List list) {
            this.val$childTvItem = textView;
            this.val$finalChilHierarchy = i8;
            this.val$childFragmentRecord = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i8 = R$id.isexpand;
            if (view.getTag(i8) == null) {
                this.val$childTvItem.setTag(i8, Boolean.TRUE);
                DebugHierarchyViewContainer.this.handleExpandView(this.val$childFragmentRecord, this.val$finalChilHierarchy, this.val$childTvItem);
                return;
            }
            boolean booleanValue = ((Boolean) view.getTag(i8)).booleanValue();
            if (booleanValue) {
                this.val$childTvItem.setCompoundDrawablesWithIntrinsicBounds(R$drawable.fragmentation_ic_right, 0, 0, 0);
                DebugHierarchyViewContainer.this.removeView(this.val$finalChilHierarchy);
            } else {
                DebugHierarchyViewContainer.this.handleExpandView(this.val$childFragmentRecord, this.val$finalChilHierarchy, this.val$childTvItem);
            }
            view.setTag(i8, Boolean.valueOf(!booleanValue));
        }
    }

    public DebugHierarchyViewContainer(Context context) {
        super(context);
        initView(context);
    }

    private int dip2px(float f8) {
        return (int) ((f8 * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private TextView getTextView(me.yokeyword.fragmentation.debug.a aVar, int i8) {
        TextView textView = new TextView(this.mContext);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, this.mItemHeight));
        if (i8 == 0) {
            textView.setTextColor(Color.parseColor("#333333"));
            textView.setTextSize(16.0f);
        }
        textView.setGravity(16);
        int i9 = this.mPadding;
        textView.setPadding((int) (i9 + (i8 * i9 * 1.5d)), 0, i9, 0);
        textView.setCompoundDrawablePadding(this.mPadding / 2);
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        textView.setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
        textView.setText(aVar.fragmentName);
        return textView;
    }

    @NonNull
    private LinearLayout getTitleLayout() {
        LinearLayout linearLayout = this.mTitleLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = new LinearLayout(this.mContext);
        this.mTitleLayout = linearLayout2;
        linearLayout2.setPadding(dip2px(24.0f), dip2px(24.0f), 0, dip2px(8.0f));
        this.mTitleLayout.setOrientation(0);
        this.mTitleLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextView textView = new TextView(this.mContext);
        textView.setText(R$string.fragmentation_stack_view);
        textView.setTextSize(20.0f);
        textView.setTextColor(-16777216);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        this.mTitleLayout.addView(textView);
        ImageView imageView = new ImageView(this.mContext);
        imageView.setImageResource(R$drawable.fragmentation_help);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = dip2px(16.0f);
        layoutParams2.gravity = 16;
        imageView.setLayoutParams(layoutParams2);
        this.mTitleLayout.setOnClickListener(new a());
        this.mTitleLayout.addView(imageView);
        return this.mTitleLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleExpandView(List<me.yokeyword.fragmentation.debug.a> list, int i8, TextView textView) {
        setView(list, i8, textView);
        textView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.fragmentation_ic_expandable, 0, 0, 0);
    }

    private void initView(Context context) {
        this.mContext = context;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.mLinearLayout = linearLayout;
        linearLayout.setOrientation(1);
        horizontalScrollView.addView(this.mLinearLayout);
        addView(horizontalScrollView);
        this.mItemHeight = dip2px(50.0f);
        this.mPadding = dip2px(16.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeView(int i8) {
        for (int childCount = this.mLinearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mLinearLayout.getChildAt(childCount);
            int i9 = R$id.hierarchy;
            if (childAt.getTag(i9) != null && ((Integer) childAt.getTag(i9)).intValue() >= i8) {
                this.mLinearLayout.removeView(childAt);
            }
        }
    }

    private void setView(List<me.yokeyword.fragmentation.debug.a> list, int i8, TextView textView) {
        for (int size = list.size() - 1; size >= 0; size--) {
            me.yokeyword.fragmentation.debug.a aVar = list.get(size);
            TextView textView2 = getTextView(aVar, i8);
            textView2.setTag(R$id.hierarchy, Integer.valueOf(i8));
            List<me.yokeyword.fragmentation.debug.a> list2 = aVar.childFragmentRecord;
            if (list2 == null || list2.size() <= 0) {
                int paddingLeft = textView2.getPaddingLeft();
                int i9 = this.mPadding;
                textView2.setPadding(paddingLeft + i9, 0, i9, 0);
            } else {
                textView2.setCompoundDrawablesWithIntrinsicBounds(R$drawable.fragmentation_ic_right, 0, 0, 0);
                textView2.setOnClickListener(new b(textView2, i8 + 1, list2));
            }
            if (textView == null) {
                this.mLinearLayout.addView(textView2);
            } else {
                LinearLayout linearLayout = this.mLinearLayout;
                linearLayout.addView(textView2, linearLayout.indexOfChild(textView) + 1);
            }
        }
    }

    public void bindFragmentRecords(List<me.yokeyword.fragmentation.debug.a> list) {
        this.mLinearLayout.removeAllViews();
        this.mLinearLayout.addView(getTitleLayout());
        if (list == null) {
            return;
        }
        setView(list, 0, null);
    }

    public DebugHierarchyViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public DebugHierarchyViewContainer(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        initView(context);
    }
}
