package com.cmplay.policy.gdpr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.cmplay.commondialog.R;

/* loaded from: classes.dex */
public class GDPRPolicyTextSpan extends ClickableSpan {
    public static final String TAG_AD = "ad";
    public static final String TAG_APP_CHOICE = "app_choice";
    public static final String TAG_POLICY = "policy";
    public static final String TAG_TERMS = "terms";
    private static final String URL_AD_CHOICE = "http://www.cmcm.com/protocol/site/ad-choice.html";
    private static final String URL_APP_CHOICE = "http://youradchoices.com/appchoices";
    private static final String URL_POLICY = "http://www.cmcm.com/protocol/site/privacy.html";
    private static final String URL_TERMS = "http://www.cmcm.com/protocol/site/tos.html";
    private String mClickString;
    private Context mContext;

    public GDPRPolicyTextSpan(Context context, String str) {
        this.mContext = context;
        this.mClickString = str;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        char c2;
        super.updateDrawState(textPaint);
        String str = this.mClickString;
        int hashCode = str.hashCode();
        if (hashCode == -982670030) {
            if (str.equals(TAG_POLICY)) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 3107) {
            if (str.equals("ad")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 110250375) {
            if (hashCode == 815098239 && str.equals(TAG_APP_CHOICE)) {
                c2 = 3;
            }
            c2 = 65535;
        } else {
            if (str.equals(TAG_TERMS)) {
                c2 = 1;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
                textPaint.setColor(this.mContext.getResources().getColor(R.color.gdpr_dialog_click_text));
                textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 2));
                textPaint.setUnderlineText(true);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        char c2;
        String str = this.mClickString;
        int hashCode = str.hashCode();
        if (hashCode == -982670030) {
            if (str.equals(TAG_POLICY)) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 3107) {
            if (str.equals("ad")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 110250375) {
            if (hashCode == 815098239 && str.equals(TAG_APP_CHOICE)) {
                c2 = 3;
            }
            c2 = 65535;
        } else {
            if (str.equals(TAG_TERMS)) {
                c2 = 1;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                startActivity(this.mContext, new Intent("android.intent.action.VIEW", Uri.parse(URL_POLICY)));
                break;
            case 1:
                startActivity(this.mContext, new Intent("android.intent.action.VIEW", Uri.parse(URL_TERMS)));
                break;
            case 2:
                startActivity(this.mContext, new Intent("android.intent.action.VIEW", Uri.parse(URL_AD_CHOICE)));
                break;
            case 3:
                startActivity(this.mContext, new Intent("android.intent.action.VIEW", Uri.parse(URL_APP_CHOICE)));
                break;
        }
    }

    public static boolean startActivity(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
