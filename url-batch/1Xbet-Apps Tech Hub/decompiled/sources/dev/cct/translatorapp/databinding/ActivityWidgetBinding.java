package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityWidgetBinding implements ViewBinding {
    public final ConstraintLayout LangSelectionICon;
    public final TextView activeTxt;
    public final ImageView appIco;
    public final ImageView appIcon;
    public final TextView back2;
    public final TextView back3;
    public final TextView back4;
    public final ImageView backBtn;
    public final MaterialCardView card1;
    public final ImageView checkbox;
    public final ImageView copyTextIcon;
    public final ImageView crossIcon;
    public final TextView detailActiveTxt;
    public final TextView detailPermissionTxt;
    public final TextView editText;
    public final TextView finishTut;
    public final ConstraintLayout imgLayout;
    public final CardView inputCardView;
    public final TextView inputLangCardTv;
    public final TextView inputLangTv;
    public final LinearLayout itemLayout;
    public final TextView langActiveTxt;
    public final TextView langTxt;
    public final View lastView;
    public final LinearLayout linearLayout;
    public final ImageView link1Tut;
    public final ImageView link2Tut;
    public final ImageView link3Tut;
    public final ImageView link4Tut;
    public final TextView next1;
    public final TextView next2;
    public final TextView next3;
    public final ImageView offStateWidget;
    public final ImageView onStateWidget;
    public final CardView ouputCardView;
    public final TextView out1;
    public final TextView outputLangCardTv;
    public final TextView outputLangTv;
    public final TextView outputTxt;
    public final ImageView pasteIcon;
    public final ConstraintLayout permissionICon;
    public final TextView permissionTxt;
    public final ContentLoadingProgressBar progressLoadingData;
    private final ConstraintLayout rootView;
    public final LinearLayout selectAllLayout;
    public final ImageView shareTextIcon;
    public final TextView skip;
    public final ImageView speakIcon;
    public final ImageView speakTextIcon;
    public final ImageView swap1;
    public final MaterialCardView swapCardView;
    public final ImageView swapLangIcon;
    public final TextView textView;
    public final TextView textView7;
    public final TextView textView8;
    public final TextView timer;
    public final ImageView toggleHandIcon;
    public final ImageView toggleIcon;
    public final MaterialCardView topBar;
    public final TextView transActiveTxt;
    public final TextView transTxt;
    public final TextView translateBtn;
    public final ConstraintLayout translatorICon;
    public final ImageView tutorial;
    public final ConstraintLayout tutorial1;
    public final ConstraintLayout tutorial2;
    public final ConstraintLayout tutorial3;
    public final ConstraintLayout tutorial4;
    public final ConstraintLayout tutorialsLayout;
    public final TextView txt1;
    public final ImageView widgetICon;
    public final ConstraintLayout widgetLayout;

    private ActivityWidgetBinding(ConstraintLayout rootView, ConstraintLayout LangSelectionICon, TextView activeTxt, ImageView appIco, ImageView appIcon, TextView back2, TextView back3, TextView back4, ImageView backBtn, MaterialCardView card1, ImageView checkbox, ImageView copyTextIcon, ImageView crossIcon, TextView detailActiveTxt, TextView detailPermissionTxt, TextView editText, TextView finishTut, ConstraintLayout imgLayout, CardView inputCardView, TextView inputLangCardTv, TextView inputLangTv, LinearLayout itemLayout, TextView langActiveTxt, TextView langTxt, View lastView, LinearLayout linearLayout, ImageView link1Tut, ImageView link2Tut, ImageView link3Tut, ImageView link4Tut, TextView next1, TextView next2, TextView next3, ImageView offStateWidget, ImageView onStateWidget, CardView ouputCardView, TextView out1, TextView outputLangCardTv, TextView outputLangTv, TextView outputTxt, ImageView pasteIcon, ConstraintLayout permissionICon, TextView permissionTxt, ContentLoadingProgressBar progressLoadingData, LinearLayout selectAllLayout, ImageView shareTextIcon, TextView skip, ImageView speakIcon, ImageView speakTextIcon, ImageView swap1, MaterialCardView swapCardView, ImageView swapLangIcon, TextView textView, TextView textView7, TextView textView8, TextView timer, ImageView toggleHandIcon, ImageView toggleIcon, MaterialCardView topBar, TextView transActiveTxt, TextView transTxt, TextView translateBtn, ConstraintLayout translatorICon, ImageView tutorial, ConstraintLayout tutorial1, ConstraintLayout tutorial2, ConstraintLayout tutorial3, ConstraintLayout tutorial4, ConstraintLayout tutorialsLayout, TextView txt1, ImageView widgetICon, ConstraintLayout widgetLayout) {
        this.rootView = rootView;
        this.LangSelectionICon = LangSelectionICon;
        this.activeTxt = activeTxt;
        this.appIco = appIco;
        this.appIcon = appIcon;
        this.back2 = back2;
        this.back3 = back3;
        this.back4 = back4;
        this.backBtn = backBtn;
        this.card1 = card1;
        this.checkbox = checkbox;
        this.copyTextIcon = copyTextIcon;
        this.crossIcon = crossIcon;
        this.detailActiveTxt = detailActiveTxt;
        this.detailPermissionTxt = detailPermissionTxt;
        this.editText = editText;
        this.finishTut = finishTut;
        this.imgLayout = imgLayout;
        this.inputCardView = inputCardView;
        this.inputLangCardTv = inputLangCardTv;
        this.inputLangTv = inputLangTv;
        this.itemLayout = itemLayout;
        this.langActiveTxt = langActiveTxt;
        this.langTxt = langTxt;
        this.lastView = lastView;
        this.linearLayout = linearLayout;
        this.link1Tut = link1Tut;
        this.link2Tut = link2Tut;
        this.link3Tut = link3Tut;
        this.link4Tut = link4Tut;
        this.next1 = next1;
        this.next2 = next2;
        this.next3 = next3;
        this.offStateWidget = offStateWidget;
        this.onStateWidget = onStateWidget;
        this.ouputCardView = ouputCardView;
        this.out1 = out1;
        this.outputLangCardTv = outputLangCardTv;
        this.outputLangTv = outputLangTv;
        this.outputTxt = outputTxt;
        this.pasteIcon = pasteIcon;
        this.permissionICon = permissionICon;
        this.permissionTxt = permissionTxt;
        this.progressLoadingData = progressLoadingData;
        this.selectAllLayout = selectAllLayout;
        this.shareTextIcon = shareTextIcon;
        this.skip = skip;
        this.speakIcon = speakIcon;
        this.speakTextIcon = speakTextIcon;
        this.swap1 = swap1;
        this.swapCardView = swapCardView;
        this.swapLangIcon = swapLangIcon;
        this.textView = textView;
        this.textView7 = textView7;
        this.textView8 = textView8;
        this.timer = timer;
        this.toggleHandIcon = toggleHandIcon;
        this.toggleIcon = toggleIcon;
        this.topBar = topBar;
        this.transActiveTxt = transActiveTxt;
        this.transTxt = transTxt;
        this.translateBtn = translateBtn;
        this.translatorICon = translatorICon;
        this.tutorial = tutorial;
        this.tutorial1 = tutorial1;
        this.tutorial2 = tutorial2;
        this.tutorial3 = tutorial3;
        this.tutorial4 = tutorial4;
        this.tutorialsLayout = tutorialsLayout;
        this.txt1 = txt1;
        this.widgetICon = widgetICon;
        this.widgetLayout = widgetLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWidgetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityWidgetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_widget, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWidgetBinding bind(View rootView) {
        int i = R.id.LangSelectionICon;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.LangSelectionICon);
        if (constraintLayout != null) {
            i = R.id.activeTxt;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.activeTxt);
            if (textView != null) {
                i = R.id.appIco;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.appIco);
                if (imageView != null) {
                    i = R.id.appIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.appIcon);
                    if (imageView2 != null) {
                        i = R.id.back2;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.back2);
                        if (textView2 != null) {
                            i = R.id.back3;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.back3);
                            if (textView3 != null) {
                                i = R.id.back4;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.back4);
                                if (textView4 != null) {
                                    i = R.id.back_btn;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_btn);
                                    if (imageView3 != null) {
                                        i = R.id.card1;
                                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.card1);
                                        if (materialCardView != null) {
                                            i = R.id.checkbox;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.checkbox);
                                            if (imageView4 != null) {
                                                i = R.id.copyTextIcon;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.copyTextIcon);
                                                if (imageView5 != null) {
                                                    i = R.id.cross_icon;
                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_icon);
                                                    if (imageView6 != null) {
                                                        i = R.id.detailActiveTxt;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.detailActiveTxt);
                                                        if (textView5 != null) {
                                                            i = R.id.detailPermissionTxt;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.detailPermissionTxt);
                                                            if (textView6 != null) {
                                                                i = R.id.editText;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.editText);
                                                                if (textView7 != null) {
                                                                    i = R.id.finishTut;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.finishTut);
                                                                    if (textView8 != null) {
                                                                        i = R.id.imgLayout;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.imgLayout);
                                                                        if (constraintLayout2 != null) {
                                                                            i = R.id.input_card_view;
                                                                            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.input_card_view);
                                                                            if (cardView != null) {
                                                                                i = R.id.input_lang_card_tv;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_card_tv);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.input_lang_tv;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_tv);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.itemLayout;
                                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.itemLayout);
                                                                                        if (linearLayout != null) {
                                                                                            i = R.id.langActiveTxt;
                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.langActiveTxt);
                                                                                            if (textView11 != null) {
                                                                                                i = R.id.langTxt;
                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.langTxt);
                                                                                                if (textView12 != null) {
                                                                                                    i = R.id.lastView;
                                                                                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.lastView);
                                                                                                    if (findChildViewById != null) {
                                                                                                        i = R.id.linear_layout;
                                                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linear_layout);
                                                                                                        if (linearLayout2 != null) {
                                                                                                            i = R.id.link1Tut;
                                                                                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.link1Tut);
                                                                                                            if (imageView7 != null) {
                                                                                                                i = R.id.link2Tut;
                                                                                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.link2Tut);
                                                                                                                if (imageView8 != null) {
                                                                                                                    i = R.id.link3Tut;
                                                                                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.link3Tut);
                                                                                                                    if (imageView9 != null) {
                                                                                                                        i = R.id.link4Tut;
                                                                                                                        ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.link4Tut);
                                                                                                                        if (imageView10 != null) {
                                                                                                                            i = R.id.next1;
                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.next1);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i = R.id.next2;
                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.next2);
                                                                                                                                if (textView14 != null) {
                                                                                                                                    i = R.id.next3;
                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.next3);
                                                                                                                                    if (textView15 != null) {
                                                                                                                                        i = R.id.offStateWidget;
                                                                                                                                        ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.offStateWidget);
                                                                                                                                        if (imageView11 != null) {
                                                                                                                                            i = R.id.onStateWidget;
                                                                                                                                            ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.onStateWidget);
                                                                                                                                            if (imageView12 != null) {
                                                                                                                                                i = R.id.ouput_card_view;
                                                                                                                                                CardView cardView2 = (CardView) ViewBindings.findChildViewById(rootView, R.id.ouput_card_view);
                                                                                                                                                if (cardView2 != null) {
                                                                                                                                                    i = R.id.out1;
                                                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.out1);
                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                        i = R.id.output_lang_card_tv;
                                                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_card_tv);
                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                            i = R.id.output_lang_tv;
                                                                                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_tv);
                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                i = R.id.outputTxt;
                                                                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.outputTxt);
                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                    i = R.id.paste_icon;
                                                                                                                                                                    ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.paste_icon);
                                                                                                                                                                    if (imageView13 != null) {
                                                                                                                                                                        i = R.id.permissionICon;
                                                                                                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.permissionICon);
                                                                                                                                                                        if (constraintLayout3 != null) {
                                                                                                                                                                            i = R.id.permissionTxt;
                                                                                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(rootView, R.id.permissionTxt);
                                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                                i = R.id.progressLoadingData;
                                                                                                                                                                                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressLoadingData);
                                                                                                                                                                                if (contentLoadingProgressBar != null) {
                                                                                                                                                                                    i = R.id.select_all_layout;
                                                                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.select_all_layout);
                                                                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                                                                        i = R.id.shareTextIcon;
                                                                                                                                                                                        ImageView imageView14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.shareTextIcon);
                                                                                                                                                                                        if (imageView14 != null) {
                                                                                                                                                                                            i = R.id.skip;
                                                                                                                                                                                            TextView textView21 = (TextView) ViewBindings.findChildViewById(rootView, R.id.skip);
                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                i = R.id.speak_icon;
                                                                                                                                                                                                ImageView imageView15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                                                                                                                                                                                                if (imageView15 != null) {
                                                                                                                                                                                                    i = R.id.speakTextIcon;
                                                                                                                                                                                                    ImageView imageView16 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speakTextIcon);
                                                                                                                                                                                                    if (imageView16 != null) {
                                                                                                                                                                                                        i = R.id.swap1;
                                                                                                                                                                                                        ImageView imageView17 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swap1);
                                                                                                                                                                                                        if (imageView17 != null) {
                                                                                                                                                                                                            i = R.id.swap_card_view;
                                                                                                                                                                                                            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.swap_card_view);
                                                                                                                                                                                                            if (materialCardView2 != null) {
                                                                                                                                                                                                                i = R.id.swap_lang_icon;
                                                                                                                                                                                                                ImageView imageView18 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swap_lang_icon);
                                                                                                                                                                                                                if (imageView18 != null) {
                                                                                                                                                                                                                    i = R.id.textView;
                                                                                                                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                                                        i = R.id.textView7;
                                                                                                                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView7);
                                                                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                                                                            i = R.id.textView8;
                                                                                                                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView8);
                                                                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                                                                i = R.id.timer;
                                                                                                                                                                                                                                TextView textView25 = (TextView) ViewBindings.findChildViewById(rootView, R.id.timer);
                                                                                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                                                                                    i = R.id.toggleHandIcon;
                                                                                                                                                                                                                                    ImageView imageView19 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.toggleHandIcon);
                                                                                                                                                                                                                                    if (imageView19 != null) {
                                                                                                                                                                                                                                        i = R.id.toggleIcon;
                                                                                                                                                                                                                                        ImageView imageView20 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.toggleIcon);
                                                                                                                                                                                                                                        if (imageView20 != null) {
                                                                                                                                                                                                                                            i = R.id.top_bar;
                                                                                                                                                                                                                                            MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                                                                                                                                                                                                            if (materialCardView3 != null) {
                                                                                                                                                                                                                                                i = R.id.transActiveTxt;
                                                                                                                                                                                                                                                TextView textView26 = (TextView) ViewBindings.findChildViewById(rootView, R.id.transActiveTxt);
                                                                                                                                                                                                                                                if (textView26 != null) {
                                                                                                                                                                                                                                                    i = R.id.transTxt;
                                                                                                                                                                                                                                                    TextView textView27 = (TextView) ViewBindings.findChildViewById(rootView, R.id.transTxt);
                                                                                                                                                                                                                                                    if (textView27 != null) {
                                                                                                                                                                                                                                                        i = R.id.translate_btn;
                                                                                                                                                                                                                                                        TextView textView28 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translate_btn);
                                                                                                                                                                                                                                                        if (textView28 != null) {
                                                                                                                                                                                                                                                            i = R.id.translatorICon;
                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.translatorICon);
                                                                                                                                                                                                                                                            if (constraintLayout4 != null) {
                                                                                                                                                                                                                                                                i = R.id.tutorial;
                                                                                                                                                                                                                                                                ImageView imageView21 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tutorial);
                                                                                                                                                                                                                                                                if (imageView21 != null) {
                                                                                                                                                                                                                                                                    i = R.id.tutorial1;
                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tutorial1);
                                                                                                                                                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                                                                                                                                                        i = R.id.tutorial2;
                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tutorial2);
                                                                                                                                                                                                                                                                        if (constraintLayout6 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tutorial3;
                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tutorial3);
                                                                                                                                                                                                                                                                            if (constraintLayout7 != null) {
                                                                                                                                                                                                                                                                                i = R.id.tutorial4;
                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout8 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tutorial4);
                                                                                                                                                                                                                                                                                if (constraintLayout8 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.tutorialsLayout;
                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout9 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tutorialsLayout);
                                                                                                                                                                                                                                                                                    if (constraintLayout9 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.txt1;
                                                                                                                                                                                                                                                                                        TextView textView29 = (TextView) ViewBindings.findChildViewById(rootView, R.id.txt1);
                                                                                                                                                                                                                                                                                        if (textView29 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.widgetICon;
                                                                                                                                                                                                                                                                                            ImageView imageView22 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.widgetICon);
                                                                                                                                                                                                                                                                                            if (imageView22 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.widgetLayout;
                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout10 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.widgetLayout);
                                                                                                                                                                                                                                                                                                if (constraintLayout10 != null) {
                                                                                                                                                                                                                                                                                                    return new ActivityWidgetBinding((ConstraintLayout) rootView, constraintLayout, textView, imageView, imageView2, textView2, textView3, textView4, imageView3, materialCardView, imageView4, imageView5, imageView6, textView5, textView6, textView7, textView8, constraintLayout2, cardView, textView9, textView10, linearLayout, textView11, textView12, findChildViewById, linearLayout2, imageView7, imageView8, imageView9, imageView10, textView13, textView14, textView15, imageView11, imageView12, cardView2, textView16, textView17, textView18, textView19, imageView13, constraintLayout3, textView20, contentLoadingProgressBar, linearLayout3, imageView14, textView21, imageView15, imageView16, imageView17, materialCardView2, imageView18, textView22, textView23, textView24, textView25, imageView19, imageView20, materialCardView3, textView26, textView27, textView28, constraintLayout4, imageView21, constraintLayout5, constraintLayout6, constraintLayout7, constraintLayout8, constraintLayout9, textView29, imageView22, constraintLayout10);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
