package com.mopub.mobileads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.resource.CloseButtonDrawable;
import com.mopub.mobileads.resource.DrawableConstants;
import com.mopub.network.Networking;
import com.mopub.volley.VolleyError;
import com.mopub.volley.toolbox.ImageLoader;

/* loaded from: classes2.dex */
public class VastVideoCloseButtonWidget extends RelativeLayout {
    private CloseButtonDrawable mCloseButtonDrawable;
    private final int mEdgePadding;
    private final ImageLoader mImageLoader;
    private final int mImagePadding;
    private ImageView mImageView;
    private final int mTextRightMargin;
    private TextView mTextView;
    private final int mWidgetHeight;

    public VastVideoCloseButtonWidget(Context context) {
        super(context);
        setId((int) Utils.generateUniqueId());
        this.mEdgePadding = Dips.dipsToIntPixels(6.0f, context);
        this.mImagePadding = Dips.dipsToIntPixels(15.0f, context);
        this.mWidgetHeight = Dips.dipsToIntPixels(56.0f, context);
        this.mTextRightMargin = Dips.dipsToIntPixels(0.0f, context);
        this.mCloseButtonDrawable = new CloseButtonDrawable();
        this.mImageLoader = Networking.getImageLoader(context);
        createImageView();
        createTextView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.mWidgetHeight);
        layoutParams.addRule(11);
        setLayoutParams(layoutParams);
    }

    private void createImageView() {
        this.mImageView = new ImageView(getContext());
        this.mImageView.setId((int) Utils.generateUniqueId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.mWidgetHeight, this.mWidgetHeight);
        layoutParams.addRule(11);
        this.mImageView.setImageDrawable(this.mCloseButtonDrawable);
        this.mImageView.setPadding(this.mImagePadding, this.mImagePadding + this.mEdgePadding, this.mImagePadding + this.mEdgePadding, this.mImagePadding);
        addView(this.mImageView, layoutParams);
    }

    private void createTextView() {
        this.mTextView = new TextView(getContext());
        this.mTextView.setSingleLine();
        this.mTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(20.0f);
        this.mTextView.setTypeface(DrawableConstants.CloseButton.TEXT_TYPEFACE);
        this.mTextView.setText("");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(0, this.mImageView.getId());
        this.mTextView.setPadding(0, this.mEdgePadding, 0, 0);
        layoutParams.setMargins(0, 0, this.mTextRightMargin, 0);
        addView(this.mTextView, layoutParams);
    }

    void updateCloseButtonText(String str) {
        if (this.mTextView != null) {
            this.mTextView.setText(str);
        }
    }

    void updateCloseButtonIcon(final String str) {
        this.mImageLoader.get(str, new ImageLoader.ImageListener() { // from class: com.mopub.mobileads.VastVideoCloseButtonWidget.1
            @Override // com.mopub.volley.toolbox.ImageLoader.ImageListener
            public void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
                Bitmap bitmap = imageContainer.getBitmap();
                if (bitmap != null) {
                    VastVideoCloseButtonWidget.this.mImageView.setImageBitmap(bitmap);
                } else {
                    MoPubLog.d(String.format("%s returned null bitmap", str));
                }
            }

            @Override // com.mopub.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                MoPubLog.d("Failed to load image.", volleyError);
            }
        });
    }

    void setOnTouchListenerToContent(View.OnTouchListener onTouchListener) {
        this.mImageView.setOnTouchListener(onTouchListener);
        this.mTextView.setOnTouchListener(onTouchListener);
    }

    @VisibleForTesting
    @Deprecated
    ImageView getImageView() {
        return this.mImageView;
    }

    @VisibleForTesting
    @Deprecated
    void setImageView(ImageView imageView) {
        this.mImageView = imageView;
    }

    @VisibleForTesting
    @Deprecated
    TextView getTextView() {
        return this.mTextView;
    }
}
