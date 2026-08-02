package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public abstract class LocalImageComponentKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalImage.Image.values().length];
            try {
                iArr[LocalImage.Image.START_HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_START_HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalImage.Image.ANIMATED_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalImage.Image.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalImage.Image.ID_FRONT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalImage.Image.ID_BACK_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalImage.Image.FAILURE_DEFAULT_ICON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LocalImage.Image.SELFIE_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_START_HERO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_HERO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_READY_HERO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_CHECK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_OPENED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_OPENED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_ID_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LocalImage.Image.CREATE_PERSONA_CTA_CARD_ICON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHECK_ICON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHEVRON_ICON.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LocalImage.Image.OPTION_FLAG_ICON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LocalImage.Image.OPTION_GLOBE_ICON.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LocalImage.Image.OPTION_HOME_ICON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_DOCUMENT_ICON.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_ICON.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[LocalImage.Image.OPTION_PHONE_ICON.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[LocalImage.Image.OPTION_USER_ICON.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[LocalImage.Image.REUSABLE_PERSONA_LOGO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ViewBinding makeOptionView(LocalImageComponent localImageComponent, MarkwonImpl markwonImpl, int i, int i2, String[] strArr, String[] strArr2, LocalImage localImage) {
        LinkedList linkedList = (LinkedList) markwonImpl.plugins;
        LayoutInflater layoutInflater = (LayoutInflater) markwonImpl.visitorFactory;
        if (localImage.getStyles() != null) {
            o inflate = o.inflate(layoutInflater);
            ((ThemeableLottieAnimationView) inflate.c).setAnimation(i);
            linkedList.add(new UiWorkflow$$ExternalSyntheticLambda25(inflate, localImage, strArr, strArr2, 27));
            return inflate;
        }
        int dimension = (int) ((Context) markwonImpl.parser).getResources().getDimension(R.dimen.pi2_small_default_option_local_image_height);
        o inflate$1 = o.inflate$1(layoutInflater);
        ((ImageView) inflate$1.c).setImageResource(i2);
        linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$1, dimension, 6));
        return inflate$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x05bf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View makeView(LocalImageComponent localImageComponent, MarkwonImpl markwonImpl, final LocalImage localImage) {
        ViewBinding viewBinding;
        o inflate$1;
        Context context = (Context) markwonImpl.parser;
        LayoutInflater layoutInflater = (LayoutInflater) markwonImpl.visitorFactory;
        LinkedList linkedList = (LinkedList) markwonImpl.plugins;
        int dimension = (int) context.getResources().getDimension(R.dimen.pi2_default_local_image_height);
        int dimension2 = (int) context.getResources().getDimension(R.dimen.pi2_small_default_local_image_height);
        LocalImage.Attributes attributes = localImage.getAttributes();
        LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        final int i = 6;
        final int i2 = 9;
        final int i3 = 4;
        final int i4 = 5;
        final int i5 = 7;
        final int i6 = 8;
        final int i7 = 0;
        switch (imageKey == null ? -1 : WhenMappings.$EnumSwitchMapping$0[imageKey.ordinal()]) {
            case -1:
                viewBinding = null;
                if (viewBinding != null) {
                    return viewBinding.getRoot();
                }
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                if (localImage.getStyles() != null) {
                    final o inflate = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate.c).setAnimation(R.raw.pi2_inquiry_start_hero);
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i8 = i7;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate;
                            switch (i8) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate;
                } else {
                    o inflate$12 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$12.c).setImageResource(R.drawable.pi2_inquiry_start_hero);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$12, dimension, 2));
                    viewBinding = inflate$12;
                }
                if (viewBinding != null) {
                }
                break;
            case 2:
                if (localImage.getStyles() != null) {
                    final o inflate2 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate2.c).setAnimation(R.raw.pi2_document_start_hero);
                    final int i8 = 2;
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i8;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate2;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate2;
                } else {
                    o inflate$13 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$13.c).setImageResource(R.drawable.pi2_document_start_hero);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$13, dimension, 3));
                    viewBinding = inflate$13;
                }
                if (viewBinding != null) {
                }
                break;
            case 3:
                final o inflate3 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) inflate3.c;
                themeableLottieAnimationView.setAnimation(R.raw.pi2_inquiry_successanimation);
                final int i9 = 11;
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i10 = i9;
                        o oVar = inflate3;
                        switch (i10) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView2.setRepeatMode(1);
                                themeableLottieAnimationView2.setRepeatCount(-1);
                                themeableLottieAnimationView2.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView3.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView3.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView4.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView4.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView5 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView5.setRepeatMode(1);
                                themeableLottieAnimationView5.setRepeatCount(-1);
                                themeableLottieAnimationView5.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView6 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView6.setRepeatMode(1);
                                themeableLottieAnimationView6.setRepeatCount(-1);
                                themeableLottieAnimationView6.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView7.setRepeatMode(1);
                                themeableLottieAnimationView7.setRepeatCount(-1);
                                themeableLottieAnimationView7.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView8.setRepeatMode(1);
                                themeableLottieAnimationView8.setRepeatCount(-1);
                                themeableLottieAnimationView8.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                themeableLottieAnimationView.addLottieOnCompositionLoadedListener(new OldSelfieOverlayView$$ExternalSyntheticLambda2(inflate3, 3));
                viewBinding = inflate3;
                if (viewBinding != null) {
                }
                break;
            case 4:
                if (localImage.getStyles() != null) {
                    final o inflate4 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate4.c).setAnimation(R.raw.pi2_inquiry_failed);
                    final int i10 = 3;
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i10;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate4;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate4;
                    if (viewBinding != null) {
                    }
                } else {
                    inflate$1 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$1.c).setImageResource(R.drawable.pi2_inquiry_failed);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$1, dimension2, 4));
                    viewBinding = inflate$1;
                    if (viewBinding != null) {
                    }
                }
                break;
            case 5:
                if (localImage.getStyles() != null) {
                    final o inflate5 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate5.c).setAnimation(R.raw.pi2_id_front_fail);
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i3;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate5;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate5;
                    if (viewBinding != null) {
                    }
                } else {
                    inflate$1 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$1.c).setImageResource(R.drawable.pi2_id_front_fail);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$1, dimension2, 5));
                    viewBinding = inflate$1;
                    if (viewBinding != null) {
                    }
                }
                break;
            case 6:
                if (localImage.getStyles() != null) {
                    final o inflate6 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate6.c).setAnimation(R.raw.pi2_id_back_fail);
                    final int i11 = 1;
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i11;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate6;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate6;
                    if (viewBinding != null) {
                    }
                } else {
                    inflate$1 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$1.c).setImageResource(R.drawable.pi2_id_back_fail);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$1, dimension2, 0));
                    viewBinding = inflate$1;
                    if (viewBinding != null) {
                    }
                }
                break;
            case 7:
                if (localImage.getStyles() != null) {
                    final o inflate7 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate7.c).setAnimation(R.raw.pi2_default_failed);
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i4;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate7;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate7;
                    if (viewBinding != null) {
                    }
                } else {
                    inflate$1 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$1.c).setImageResource(R.drawable.pi2_default_failed);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$1, dimension2, 7));
                    viewBinding = inflate$1;
                    if (viewBinding != null) {
                    }
                }
                break;
            case 8:
                if (localImage.getStyles() != null) {
                    final o inflate8 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate8.c).setAnimation(R.raw.pi2_selfie_fail);
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate8;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate8;
                    if (viewBinding != null) {
                    }
                } else {
                    inflate$1 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$1.c).setImageResource(R.drawable.pi2_selfie_fail);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$1, dimension2, 8));
                    viewBinding = inflate$1;
                    if (viewBinding != null) {
                    }
                }
                break;
            case 9:
                if (localImage.getStyles() != null) {
                    final o inflate9 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate9.c).setAnimation(R.raw.pi2_document_failed);
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i5;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate9;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate9;
                } else {
                    o inflate$14 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$14.c).setImageResource(R.drawable.pi2_document_failed);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$14, dimension, 9));
                    viewBinding = inflate$14;
                }
                if (viewBinding != null) {
                }
                break;
            case 10:
                if (localImage.getStyles() != null) {
                    final o inflate10 = o.inflate(layoutInflater);
                    ((ThemeableLottieAnimationView) inflate10.c).setAnimation(R.raw.pi2_passport_nfc_start_hero);
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i6;
                            LocalImage localImage2 = localImage;
                            o oVar = inflate10;
                            switch (i82) {
                                case 0:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 1:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 2:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 3:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 4:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 5:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#180052"}, new String[0], new String[0], new String[]{"#FFFFFF"});
                                    break;
                                case 6:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                                    break;
                                case 7:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0], new String[0]);
                                    break;
                                default:
                                    ImageStylingKt.applyStyle(localImage2.getStyles(), (ThemeableLottieAnimationView) oVar.c, new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[0], new String[]{"#AA84FF"});
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    viewBinding = inflate10;
                } else {
                    o inflate$15 = o.inflate$1(layoutInflater);
                    ((ImageView) inflate$15.c).setImageResource(R.drawable.pi2_passport_nfc_start_hero);
                    linkedList.add(new LocalImageComponentKt$$ExternalSyntheticLambda2(inflate$15, dimension, 1));
                    viewBinding = inflate$15;
                }
                if (viewBinding != null) {
                }
                break;
            case 11:
                final o inflate11 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) inflate11.c;
                themeableLottieAnimationView2.setAnimation(R.raw.pi2_passport_nfc_scan_hero);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView2, new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[0], new String[]{"#FFFFFF"});
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i7;
                        o oVar = inflate11;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView3.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView3.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView4.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView4.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView5 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView5.setRepeatMode(1);
                                themeableLottieAnimationView5.setRepeatCount(-1);
                                themeableLottieAnimationView5.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView6 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView6.setRepeatMode(1);
                                themeableLottieAnimationView6.setRepeatCount(-1);
                                themeableLottieAnimationView6.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView7.setRepeatMode(1);
                                themeableLottieAnimationView7.setRepeatCount(-1);
                                themeableLottieAnimationView7.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView8.setRepeatMode(1);
                                themeableLottieAnimationView8.setRepeatCount(-1);
                                themeableLottieAnimationView8.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate11;
                if (viewBinding != null) {
                }
                break;
            case 12:
                final o inflate12 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) inflate12.c;
                themeableLottieAnimationView3.setAnimation(R.raw.pi2_passport_nfc_scan_ready_hero);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView3, new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, new String[0], new String[0]);
                final int i12 = 1;
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i12;
                        o oVar = inflate12;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView4.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView4.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView5 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView5.setRepeatMode(1);
                                themeableLottieAnimationView5.setRepeatCount(-1);
                                themeableLottieAnimationView5.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView6 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView6.setRepeatMode(1);
                                themeableLottieAnimationView6.setRepeatCount(-1);
                                themeableLottieAnimationView6.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView7.setRepeatMode(1);
                                themeableLottieAnimationView7.setRepeatCount(-1);
                                themeableLottieAnimationView7.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView8.setRepeatMode(1);
                                themeableLottieAnimationView8.setRepeatCount(-1);
                                themeableLottieAnimationView8.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate12;
                if (viewBinding != null) {
                }
                break;
            case 13:
                final o inflate13 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) inflate13.c;
                themeableLottieAnimationView4.setAnimation(R.raw.pi2_passport_nfc_check);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView4, new String[]{"#280087"}, new String[0], new String[0], new String[0]);
                final int i13 = 2;
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i13;
                        o oVar = inflate13;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView5 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView5.setRepeatMode(1);
                                themeableLottieAnimationView5.setRepeatCount(-1);
                                themeableLottieAnimationView5.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView6 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView6.setRepeatMode(1);
                                themeableLottieAnimationView6.setRepeatCount(-1);
                                themeableLottieAnimationView6.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView7.setRepeatMode(1);
                                themeableLottieAnimationView7.setRepeatCount(-1);
                                themeableLottieAnimationView7.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView8.setRepeatMode(1);
                                themeableLottieAnimationView8.setRepeatCount(-1);
                                themeableLottieAnimationView8.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate13;
                if (viewBinding != null) {
                }
                break;
            case 14:
                final o inflate14 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView5 = (ThemeableLottieAnimationView) inflate14.c;
                themeableLottieAnimationView5.setAnimation(R.raw.pi2_government_id_nfc_scan_back_closed);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView5, new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                final int i14 = 3;
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i14;
                        o oVar = inflate14;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView52.setRepeatMode(1);
                                themeableLottieAnimationView52.setRepeatCount(-1);
                                themeableLottieAnimationView52.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView6 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView6.setRepeatMode(1);
                                themeableLottieAnimationView6.setRepeatCount(-1);
                                themeableLottieAnimationView6.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView7.setRepeatMode(1);
                                themeableLottieAnimationView7.setRepeatCount(-1);
                                themeableLottieAnimationView7.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView8.setRepeatMode(1);
                                themeableLottieAnimationView8.setRepeatCount(-1);
                                themeableLottieAnimationView8.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate14;
                if (viewBinding != null) {
                }
                break;
            case 15:
                final o inflate15 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView6 = (ThemeableLottieAnimationView) inflate15.c;
                themeableLottieAnimationView6.setAnimation(R.raw.pi2_government_id_nfc_scan_front_closed);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView6, new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i3;
                        o oVar = inflate15;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView52.setRepeatMode(1);
                                themeableLottieAnimationView52.setRepeatCount(-1);
                                themeableLottieAnimationView52.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView62 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView62.setRepeatMode(1);
                                themeableLottieAnimationView62.setRepeatCount(-1);
                                themeableLottieAnimationView62.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView7.setRepeatMode(1);
                                themeableLottieAnimationView7.setRepeatCount(-1);
                                themeableLottieAnimationView7.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView8.setRepeatMode(1);
                                themeableLottieAnimationView8.setRepeatCount(-1);
                                themeableLottieAnimationView8.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate15;
                if (viewBinding != null) {
                }
                break;
            case 16:
                final o inflate16 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) inflate16.c;
                themeableLottieAnimationView7.setAnimation(R.raw.pi2_government_id_nfc_scan_front_opened);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView7, new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i4;
                        o oVar = inflate16;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView52.setRepeatMode(1);
                                themeableLottieAnimationView52.setRepeatCount(-1);
                                themeableLottieAnimationView52.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView62 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView62.setRepeatMode(1);
                                themeableLottieAnimationView62.setRepeatCount(-1);
                                themeableLottieAnimationView62.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView72 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView72.setRepeatMode(1);
                                themeableLottieAnimationView72.setRepeatCount(-1);
                                themeableLottieAnimationView72.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView8.setRepeatMode(1);
                                themeableLottieAnimationView8.setRepeatCount(-1);
                                themeableLottieAnimationView8.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate16;
                if (viewBinding != null) {
                }
                break;
            case 17:
                final o inflate17 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) inflate17.c;
                themeableLottieAnimationView8.setAnimation(R.raw.pi2_government_id_nfc_scan_back_opened);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView8, new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC", "#7379FD"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i;
                        o oVar = inflate17;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView52.setRepeatMode(1);
                                themeableLottieAnimationView52.setRepeatCount(-1);
                                themeableLottieAnimationView52.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView62 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView62.setRepeatMode(1);
                                themeableLottieAnimationView62.setRepeatCount(-1);
                                themeableLottieAnimationView62.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView72 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView72.setRepeatMode(1);
                                themeableLottieAnimationView72.setRepeatCount(-1);
                                themeableLottieAnimationView72.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView82 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView82.setRepeatMode(1);
                                themeableLottieAnimationView82.setRepeatCount(-1);
                                themeableLottieAnimationView82.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView9.setRepeatMode(1);
                                themeableLottieAnimationView9.setRepeatCount(-1);
                                themeableLottieAnimationView9.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate17;
                if (viewBinding != null) {
                }
                break;
            case 18:
                final o inflate18 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) inflate18.c;
                themeableLottieAnimationView9.setAnimation(R.raw.pi2_government_id_nfc_scan_photo_page);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView9, new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i5;
                        o oVar = inflate18;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView52.setRepeatMode(1);
                                themeableLottieAnimationView52.setRepeatCount(-1);
                                themeableLottieAnimationView52.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView62 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView62.setRepeatMode(1);
                                themeableLottieAnimationView62.setRepeatCount(-1);
                                themeableLottieAnimationView62.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView72 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView72.setRepeatMode(1);
                                themeableLottieAnimationView72.setRepeatCount(-1);
                                themeableLottieAnimationView72.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView82 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView82.setRepeatMode(1);
                                themeableLottieAnimationView82.setRepeatCount(-1);
                                themeableLottieAnimationView82.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView92 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView92.setRepeatMode(1);
                                themeableLottieAnimationView92.setRepeatCount(-1);
                                themeableLottieAnimationView92.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView10.setRepeatMode(1);
                                themeableLottieAnimationView10.setRepeatCount(-1);
                                themeableLottieAnimationView10.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate18;
                if (viewBinding != null) {
                }
                break;
            case 19:
                final o inflate19 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) inflate19.c;
                themeableLottieAnimationView10.setAnimation(R.raw.pi2_government_id_nfc_scan_id_card);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView10, new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i6;
                        o oVar = inflate19;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView52.setRepeatMode(1);
                                themeableLottieAnimationView52.setRepeatCount(-1);
                                themeableLottieAnimationView52.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView62 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView62.setRepeatMode(1);
                                themeableLottieAnimationView62.setRepeatCount(-1);
                                themeableLottieAnimationView62.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView72 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView72.setRepeatMode(1);
                                themeableLottieAnimationView72.setRepeatCount(-1);
                                themeableLottieAnimationView72.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView82 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView82.setRepeatMode(1);
                                themeableLottieAnimationView82.setRepeatCount(-1);
                                themeableLottieAnimationView82.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView92 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView92.setRepeatMode(1);
                                themeableLottieAnimationView92.setRepeatCount(-1);
                                themeableLottieAnimationView92.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView102 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView102.setRepeatMode(1);
                                themeableLottieAnimationView102.setRepeatCount(-1);
                                themeableLottieAnimationView102.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView11.setRepeatMode(1);
                                themeableLottieAnimationView11.setRepeatCount(-1);
                                themeableLottieAnimationView11.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate19;
                if (viewBinding != null) {
                }
                break;
            case 20:
                final o inflate20 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView11 = (ThemeableLottieAnimationView) inflate20.c;
                themeableLottieAnimationView11.setAnimation(R.raw.pi2_government_id_nfc_scan_back_then_front);
                ImageStylingKt.applyStyleWithDefaults(localImage.getStyles(), themeableLottieAnimationView11, new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i2;
                        o oVar = inflate20;
                        switch (i102) {
                            case 0:
                                ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView22.setRepeatMode(1);
                                themeableLottieAnimationView22.setRepeatCount(-1);
                                themeableLottieAnimationView22.playAnimation();
                                break;
                            case 1:
                                ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                if (layoutParams == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                    break;
                                }
                            case 2:
                                ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                if (layoutParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case 3:
                                ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView52.setRepeatMode(1);
                                themeableLottieAnimationView52.setRepeatCount(-1);
                                themeableLottieAnimationView52.playAnimation();
                                break;
                            case 4:
                                ThemeableLottieAnimationView themeableLottieAnimationView62 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView62.setRepeatMode(1);
                                themeableLottieAnimationView62.setRepeatCount(-1);
                                themeableLottieAnimationView62.playAnimation();
                                break;
                            case 5:
                                ThemeableLottieAnimationView themeableLottieAnimationView72 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView72.setRepeatMode(1);
                                themeableLottieAnimationView72.setRepeatCount(-1);
                                themeableLottieAnimationView72.playAnimation();
                                break;
                            case 6:
                                ThemeableLottieAnimationView themeableLottieAnimationView82 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView82.setRepeatMode(1);
                                themeableLottieAnimationView82.setRepeatCount(-1);
                                themeableLottieAnimationView82.playAnimation();
                                break;
                            case 7:
                                ThemeableLottieAnimationView themeableLottieAnimationView92 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView92.setRepeatMode(1);
                                themeableLottieAnimationView92.setRepeatCount(-1);
                                themeableLottieAnimationView92.playAnimation();
                                break;
                            case 8:
                                ThemeableLottieAnimationView themeableLottieAnimationView102 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView102.setRepeatMode(1);
                                themeableLottieAnimationView102.setRepeatCount(-1);
                                themeableLottieAnimationView102.playAnimation();
                                break;
                            case 9:
                                ThemeableLottieAnimationView themeableLottieAnimationView112 = (ThemeableLottieAnimationView) oVar.c;
                                themeableLottieAnimationView112.setRepeatMode(1);
                                themeableLottieAnimationView112.setRepeatCount(-1);
                                themeableLottieAnimationView112.playAnimation();
                                break;
                            case 10:
                                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView12.getLayoutParams();
                                if (layoutParams3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                    themeableLottieAnimationView12.setLayoutParams(layoutParams3);
                                    break;
                                }
                            default:
                                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                if (layoutParams4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    break;
                                } else {
                                    if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                        ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                    }
                                    themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                    break;
                                }
                        }
                        return null;
                    }
                });
                viewBinding = inflate20;
                if (viewBinding != null) {
                }
                break;
            case 21:
                final o inflate21 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView12 = (ThemeableLottieAnimationView) inflate21.c;
                themeableLottieAnimationView12.setImageResource(R.drawable.pi2_create_persona_cta_card_icon);
                if (localImage.getStyles() != null) {
                    ImageStylingKt.applyStyle(localImage.getStyles(), themeableLottieAnimationView12, new String[0], new String[0], new String[0], new String[0]);
                    viewBinding = inflate21;
                } else {
                    final int i15 = 10;
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i102 = i15;
                            o oVar = inflate21;
                            switch (i102) {
                                case 0:
                                    ThemeableLottieAnimationView themeableLottieAnimationView22 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView22.setRepeatMode(1);
                                    themeableLottieAnimationView22.setRepeatCount(-1);
                                    themeableLottieAnimationView22.playAnimation();
                                    break;
                                case 1:
                                    ThemeableLottieAnimationView themeableLottieAnimationView32 = (ThemeableLottieAnimationView) oVar.c;
                                    ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView32.getLayoutParams();
                                    if (layoutParams == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        break;
                                    } else {
                                        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                                            ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = 0.5f;
                                        }
                                        themeableLottieAnimationView32.setLayoutParams(layoutParams);
                                        break;
                                    }
                                case 2:
                                    ThemeableLottieAnimationView themeableLottieAnimationView42 = (ThemeableLottieAnimationView) oVar.c;
                                    ViewGroup.LayoutParams layoutParams2 = themeableLottieAnimationView42.getLayoutParams();
                                    if (layoutParams2 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        break;
                                    } else {
                                        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                                            ((ConstraintLayout.LayoutParams) layoutParams2).matchConstraintPercentWidth = 0.5f;
                                        }
                                        themeableLottieAnimationView42.setLayoutParams(layoutParams2);
                                        break;
                                    }
                                case 3:
                                    ThemeableLottieAnimationView themeableLottieAnimationView52 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView52.setRepeatMode(1);
                                    themeableLottieAnimationView52.setRepeatCount(-1);
                                    themeableLottieAnimationView52.playAnimation();
                                    break;
                                case 4:
                                    ThemeableLottieAnimationView themeableLottieAnimationView62 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView62.setRepeatMode(1);
                                    themeableLottieAnimationView62.setRepeatCount(-1);
                                    themeableLottieAnimationView62.playAnimation();
                                    break;
                                case 5:
                                    ThemeableLottieAnimationView themeableLottieAnimationView72 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView72.setRepeatMode(1);
                                    themeableLottieAnimationView72.setRepeatCount(-1);
                                    themeableLottieAnimationView72.playAnimation();
                                    break;
                                case 6:
                                    ThemeableLottieAnimationView themeableLottieAnimationView82 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView82.setRepeatMode(1);
                                    themeableLottieAnimationView82.setRepeatCount(-1);
                                    themeableLottieAnimationView82.playAnimation();
                                    break;
                                case 7:
                                    ThemeableLottieAnimationView themeableLottieAnimationView92 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView92.setRepeatMode(1);
                                    themeableLottieAnimationView92.setRepeatCount(-1);
                                    themeableLottieAnimationView92.playAnimation();
                                    break;
                                case 8:
                                    ThemeableLottieAnimationView themeableLottieAnimationView102 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView102.setRepeatMode(1);
                                    themeableLottieAnimationView102.setRepeatCount(-1);
                                    themeableLottieAnimationView102.playAnimation();
                                    break;
                                case 9:
                                    ThemeableLottieAnimationView themeableLottieAnimationView112 = (ThemeableLottieAnimationView) oVar.c;
                                    themeableLottieAnimationView112.setRepeatMode(1);
                                    themeableLottieAnimationView112.setRepeatCount(-1);
                                    themeableLottieAnimationView112.playAnimation();
                                    break;
                                case 10:
                                    ThemeableLottieAnimationView themeableLottieAnimationView122 = (ThemeableLottieAnimationView) oVar.c;
                                    ViewGroup.LayoutParams layoutParams3 = themeableLottieAnimationView122.getLayoutParams();
                                    if (layoutParams3 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        break;
                                    } else {
                                        layoutParams3.height = (int) ExtensionsKt.getDpToPx(44.0d);
                                        themeableLottieAnimationView122.setLayoutParams(layoutParams3);
                                        break;
                                    }
                                default:
                                    ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) oVar.c;
                                    ViewGroup.LayoutParams layoutParams4 = themeableLottieAnimationView13.getLayoutParams();
                                    if (layoutParams4 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        break;
                                    } else {
                                        if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                                            ((ConstraintLayout.LayoutParams) layoutParams4).matchConstraintPercentWidth = 0.5f;
                                        }
                                        themeableLottieAnimationView13.setLayoutParams(layoutParams4);
                                        break;
                                    }
                            }
                            return null;
                        }
                    });
                    viewBinding = inflate21;
                }
                if (viewBinding != null) {
                }
                break;
            case 22:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_check_icon, R.drawable.p2_option_check_icon, new String[0], new String[0], localImage);
                if (viewBinding != null) {
                }
                break;
            case 23:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_chevron_icon, R.drawable.p2_option_chevron_icon, new String[]{"#000000"}, new String[0], localImage);
                if (viewBinding != null) {
                }
                break;
            case 24:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_flag_icon, R.drawable.p2_option_flag_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, localImage);
                if (viewBinding != null) {
                }
                break;
            case 25:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_globe_icon, R.drawable.p2_option_globe_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, localImage);
                if (viewBinding != null) {
                }
                break;
            case 26:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_home_icon, R.drawable.p2_option_home_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, localImage);
                if (viewBinding != null) {
                }
                break;
            case 27:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_id_document_icon, R.drawable.p2_option_id_document_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, localImage);
                if (viewBinding != null) {
                }
                break;
            case 28:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_id_icon, R.drawable.p2_option_id_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, localImage);
                if (viewBinding != null) {
                }
                break;
            case 29:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_phone_icon, R.drawable.p2_option_phone_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, localImage);
                if (viewBinding != null) {
                }
                break;
            case 30:
                viewBinding = makeOptionView(localImageComponent, markwonImpl, R.raw.pi2_option_user_icon, R.drawable.p2_option_user_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"}, localImage);
                if (viewBinding != null) {
                }
                break;
            case 31:
                o inflate22 = o.inflate(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView13 = (ThemeableLottieAnimationView) inflate22.c;
                themeableLottieAnimationView13.setImageResource(R.drawable.pi2_reusable_persona_logo);
                viewBinding = inflate22;
                if (localImage.getStyles() != null) {
                    ImageStylingKt.applyStyle(localImage.getStyles(), themeableLottieAnimationView13, new String[0], new String[0], new String[0], new String[0]);
                    viewBinding = inflate22;
                }
                if (viewBinding != null) {
                }
                break;
        }
    }
}
