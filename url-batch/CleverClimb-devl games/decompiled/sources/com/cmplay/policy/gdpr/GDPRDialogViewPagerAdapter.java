package com.cmplay.policy.gdpr;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.widget.NestedScrollView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.cmplay.commondialog.R;

/* loaded from: classes.dex */
public class GDPRDialogViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private IDialogPagerListener mListener = null;

    public interface IDialogPagerListener {
        void onScrollChange();
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public GDPRDialogViewPagerAdapter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
    }

    public void setListener(IDialogPagerListener iDialogPagerListener) {
        this.mListener = iDialogPagerListener;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.mInflater.inflate(R.layout.cmplay_pager_gdpr_dialog_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.pager_image);
        TextView textView = (TextView) inflate.findViewById(R.id.pager_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.pager_content);
        switch (i) {
            case 0:
                imageView.setImageResource(R.drawable.cmplay__gdpr_pic_game);
                textView.setText(R.string.gdpr_policy_title);
                setPolicyText(textView2, this.mContext.getString(R.string.gdpr_policy_content), this.mContext);
                break;
            case 1:
                imageView.setImageResource(R.drawable.cmplay__gdpr_pic_game);
                textView.setText(R.string.gdpr_custom_title);
                setPolicyText(textView2, this.mContext.getString(R.string.gdpr_custom_content), this.mContext);
                break;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(R.id.pager_scrollview);
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.cmplay.policy.gdpr.GDPRDialogViewPagerAdapter.1
            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView2, int i2, int i3, int i4, int i5) {
                if (GDPRDialogViewPagerAdapter.this.mListener != null) {
                    GDPRDialogViewPagerAdapter.this.mListener.onScrollChange();
                }
            }
        });
        nestedScrollView.setOverScrollMode(2);
        viewGroup.addView(inflate);
        return inflate;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        return GDPRPolicyDialog.PAGE_NUM;
    }

    private void setPolicyText(TextView textView, String str, Context context) {
        if (textView == null || TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(HtmlUtil.fromHtml(str));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        CharSequence text = textView.getText();
        int length = text.length();
        Spannable spannable = (Spannable) textView.getText();
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, length, URLSpan.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new GDPRPolicyTextSpan(context, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 33);
        }
        textView.setText(spannableStringBuilder);
    }
}
