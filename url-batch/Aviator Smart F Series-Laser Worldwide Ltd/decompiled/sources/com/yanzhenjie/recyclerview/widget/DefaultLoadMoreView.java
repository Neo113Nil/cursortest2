package com.yanzhenjie.recyclerview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.yanzhenjie.recyclerview.R$id;
import com.yanzhenjie.recyclerview.R$layout;
import com.yanzhenjie.recyclerview.R$string;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes4.dex */
public class DefaultLoadMoreView extends LinearLayout implements SwipeRecyclerView.g, View.OnClickListener {
    private SwipeRecyclerView.f mLoadMoreListener;
    private ProgressBar mProgressBar;
    private TextView mTvMessage;

    public DefaultLoadMoreView(Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.yanzhenjie.recyclerview.SwipeRecyclerView.g
    public void onLoadError(int i8, String str) {
        setVisibility(0);
        this.mProgressBar.setVisibility(8);
        this.mTvMessage.setVisibility(0);
        TextView textView = this.mTvMessage;
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R$string.support_recycler_load_error);
        }
        textView.setText(str);
    }

    @Override // com.yanzhenjie.recyclerview.SwipeRecyclerView.g
    public void onLoadFinish(boolean z7, boolean z8) {
        if (z8) {
            setVisibility(4);
            return;
        }
        setVisibility(0);
        if (z7) {
            this.mProgressBar.setVisibility(8);
            this.mTvMessage.setVisibility(0);
            this.mTvMessage.setText(R$string.support_recycler_data_empty);
        } else {
            this.mProgressBar.setVisibility(8);
            this.mTvMessage.setVisibility(0);
            this.mTvMessage.setText(R$string.support_recycler_more_not);
        }
    }

    @Override // com.yanzhenjie.recyclerview.SwipeRecyclerView.g
    public void onLoading() {
        setVisibility(0);
        this.mProgressBar.setVisibility(0);
        this.mTvMessage.setVisibility(0);
        this.mTvMessage.setText(R$string.support_recycler_load_more_message);
    }

    @Override // com.yanzhenjie.recyclerview.SwipeRecyclerView.g
    public void onWaitToLoadMore(SwipeRecyclerView.f fVar) {
        setVisibility(0);
        this.mProgressBar.setVisibility(8);
        this.mTvMessage.setVisibility(0);
        this.mTvMessage.setText(R$string.support_recycler_click_load_more);
    }

    public DefaultLoadMoreView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(17);
        setVisibility(8);
        setMinimumHeight((int) ((getResources().getDisplayMetrics().density * 60.0f) + 0.5d));
        View.inflate(getContext(), R$layout.support_recycler_view_load_more, this);
        this.mProgressBar = (ProgressBar) findViewById(R$id.progress_bar);
        this.mTvMessage = (TextView) findViewById(R$id.tv_load_more_message);
        setOnClickListener(this);
    }
}
