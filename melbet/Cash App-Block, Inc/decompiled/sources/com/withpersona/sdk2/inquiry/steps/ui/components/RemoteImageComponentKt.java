package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda1;
import androidx.core.os.BundleKt;
import coil3.ComponentRegistry;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda0;
import coil3.Extras;
import coil3.ImageLoader$Builder;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.svg.SvgDecoder;
import coil3.transition.CrossfadeTransition;
import com.miteksystems.misnap.workflow.a.o;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.ResourceType;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;

/* loaded from: classes9.dex */
public abstract class RemoteImageComponentKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RemoteImage.ContentType.values().length];
            try {
                iArr[RemoteImage.ContentType.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteImage.ContentType.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteImage.ContentType.SVG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getColorReplacedSvg(String str, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Integer originalStrokeColorValue;
        Integer originalBackgroundColorValue;
        Integer originalHighlightColorValue;
        Integer originalFillColorValue;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle != null && (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int intValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue != null) {
                ExtensionsKt.toHexColorString(newFillColorValue.intValue());
                str = StringsKt__StringsJVMKt.replace$default(str, ExtensionsKt.toHexColorString(intValue), "{{ fill_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int intValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null) {
                ExtensionsKt.toHexColorString(newHighlightColorValue.intValue());
                str = StringsKt__StringsJVMKt.replace$default(str, ExtensionsKt.toHexColorString(intValue2), "{{ highlight_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int intValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null) {
                ExtensionsKt.toHexColorString(newBackgroundColorValue.intValue());
                str = StringsKt__StringsJVMKt.replace$default(str, ExtensionsKt.toHexColorString(intValue3), "{{ background_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int intValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null) {
                ExtensionsKt.toHexColorString(newStrokeColorValue.intValue());
                str = StringsKt__StringsJVMKt.replace$default(str, ExtensionsKt.toHexColorString(intValue4), "{{ stroke_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int intValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null) {
                str = replaceHexCodes(str, "{{ fill_color }}", ExtensionsKt.toHexColorString(newFillColorValue2.intValue()), ExtensionsKt.toHexColorString(intValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int intValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null) {
                str = replaceHexCodes(str, "{{ highlight_color }}", ExtensionsKt.toHexColorString(newHighlightColorValue2.intValue()), ExtensionsKt.toHexColorString(intValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int intValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null) {
                str = replaceHexCodes(str, "{{ background_color }}", ExtensionsKt.toHexColorString(newBackgroundColorValue2.intValue()), ExtensionsKt.toHexColorString(intValue7));
            }
        }
        if (remoteImageComponentStyle == null || (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) == null) {
            return str;
        }
        int intValue8 = originalStrokeColorValue.intValue();
        Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
        return newStrokeColorValue2 != null ? replaceHexCodes(str, "{{ stroke_color }}", ExtensionsKt.toHexColorString(newStrokeColorValue2.intValue()), ExtensionsKt.toHexColorString(intValue8)) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View makeView(RemoteImageComponent remoteImageComponent, MarkwonImpl markwonImpl, final RemoteImage remoteImage) {
        View view;
        ThemeableLottieAnimationView themeableLottieAnimationView;
        final o inflate;
        String localAssetName;
        RemoteImage.ContentType localAssetContentType;
        String str;
        final o oVar;
        Integer resourceIdFromName;
        final o inflate2;
        Context context = (Context) markwonImpl.parser;
        remoteImageComponent.getClass();
        remoteImage.getClass();
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String localAssetName2 = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType2 = attributes != null ? attributes.getLocalAssetContentType() : null;
        LayoutInflater layoutInflater = (LayoutInflater) markwonImpl.visitorFactory;
        LinkedList linkedList = (LinkedList) markwonImpl.plugins;
        final int i = 2;
        final int i2 = 1;
        if (localAssetName2 != null && localAssetContentType2 != null) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i3 = iArr[localAssetContentType2.ordinal()];
            if (i3 == 1) {
                resourceIdFromName = ResToolsKt.resourceIdFromName(context, localAssetName2, ResourceType.Raw);
            } else if (i3 == 2) {
                resourceIdFromName = ResToolsKt.resourceIdFromName(context, localAssetName2, ResourceType.Drawable);
            } else {
                if (i3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                resourceIdFromName = ResToolsKt.resourceIdFromName(context, localAssetName2, ResourceType.Raw);
                if (resourceIdFromName != null) {
                    ref$BooleanRef.element = true;
                } else {
                    resourceIdFromName = ResToolsKt.resourceIdFromName(context, localAssetName2, ResourceType.Drawable);
                }
            }
            if (resourceIdFromName != null) {
                int intValue = resourceIdFromName.intValue();
                int i4 = iArr[localAssetContentType2.ordinal()];
                if (i4 == 1) {
                    inflate2 = o.inflate(layoutInflater);
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = i;
                            RemoteImage remoteImage2 = remoteImage;
                            o oVar2 = inflate2;
                            switch (i5) {
                                case 0:
                                    ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) oVar2.c;
                                    ImageStylingKt.applyStyles(themeableLottieAnimationView2, remoteImage2);
                                    themeableLottieAnimationView2.setRepeatMode(1);
                                    themeableLottieAnimationView2.setRepeatCount(-1);
                                    themeableLottieAnimationView2.playAnimation();
                                    break;
                                case 1:
                                    ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) oVar2.c;
                                    ImageStylingKt.applyStyles(themeableLottieAnimationView3, remoteImage2);
                                    themeableLottieAnimationView3.setRepeatMode(1);
                                    themeableLottieAnimationView3.setRepeatCount(-1);
                                    themeableLottieAnimationView3.playAnimation();
                                    break;
                                default:
                                    ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) oVar2.c;
                                    ImageStylingKt.applyStyles(themeableLottieAnimationView4, remoteImage2);
                                    themeableLottieAnimationView4.setRepeatMode(1);
                                    themeableLottieAnimationView4.setRepeatCount(-1);
                                    themeableLottieAnimationView4.playAnimation();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    ((ThemeableLottieAnimationView) inflate2.c).setAnimation(intValue);
                } else if (i4 == 2) {
                    inflate2 = o.inflate$1(layoutInflater);
                    linkedList.add(new Http2Connection$$ExternalSyntheticLambda3(inflate2, remoteImage, intValue, 10));
                } else {
                    if (i4 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    inflate2 = o.inflate$1(layoutInflater);
                    linkedList.add(new Media3MuxerImpl$$ExternalSyntheticLambda1(inflate2, remoteImage, ref$BooleanRef, intValue));
                }
                view = inflate2.getRoot();
                if (view == null) {
                    return view;
                }
                RemoteImage.Attributes attributes2 = remoteImage.getAttributes();
                if (attributes2 != null && (localAssetName = attributes2.getLocalAssetName()) != null && (localAssetContentType = attributes2.getLocalAssetContentType()) != null) {
                    int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                    int i5 = iArr2[localAssetContentType.ordinal()];
                    if (i5 == 1) {
                        str = "json";
                    } else if (i5 == 2) {
                        str = "png";
                    } else {
                        if (i5 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str = "svg";
                    }
                    String m = Recorder$$ExternalSyntheticOutline2.m(localAssetName, ".", str);
                    try {
                        context.getAssets().open(m).close();
                        if (iArr2[localAssetContentType.ordinal()] == 1) {
                            oVar = o.inflate(layoutInflater);
                            linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i52 = i2;
                                    RemoteImage remoteImage2 = remoteImage;
                                    o oVar2 = oVar;
                                    switch (i52) {
                                        case 0:
                                            ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) oVar2.c;
                                            ImageStylingKt.applyStyles(themeableLottieAnimationView2, remoteImage2);
                                            themeableLottieAnimationView2.setRepeatMode(1);
                                            themeableLottieAnimationView2.setRepeatCount(-1);
                                            themeableLottieAnimationView2.playAnimation();
                                            break;
                                        case 1:
                                            ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) oVar2.c;
                                            ImageStylingKt.applyStyles(themeableLottieAnimationView3, remoteImage2);
                                            themeableLottieAnimationView3.setRepeatMode(1);
                                            themeableLottieAnimationView3.setRepeatCount(-1);
                                            themeableLottieAnimationView3.playAnimation();
                                            break;
                                        default:
                                            ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) oVar2.c;
                                            ImageStylingKt.applyStyles(themeableLottieAnimationView4, remoteImage2);
                                            themeableLottieAnimationView4.setRepeatMode(1);
                                            themeableLottieAnimationView4.setRepeatCount(-1);
                                            themeableLottieAnimationView4.playAnimation();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                            ((ThemeableLottieAnimationView) oVar.c).setAnimation(m);
                        } else {
                            oVar = null;
                        }
                    } catch (Exception unused) {
                    }
                    if (oVar != null) {
                        themeableLottieAnimationView = (ThemeableLottieAnimationView) oVar.a;
                        if (themeableLottieAnimationView == null) {
                            return themeableLottieAnimationView;
                        }
                        final RemoteImage.Attributes attributes3 = remoteImage.getAttributes();
                        RemoteImage.ContentType contentType = attributes3 != null ? attributes3.getContentType() : null;
                        int i6 = contentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
                        final int i7 = 0;
                        if (i6 == 1) {
                            inflate = o.inflate(layoutInflater);
                            linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i52 = i7;
                                    RemoteImage remoteImage2 = remoteImage;
                                    o oVar2 = inflate;
                                    switch (i52) {
                                        case 0:
                                            ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) oVar2.c;
                                            ImageStylingKt.applyStyles(themeableLottieAnimationView2, remoteImage2);
                                            themeableLottieAnimationView2.setRepeatMode(1);
                                            themeableLottieAnimationView2.setRepeatCount(-1);
                                            themeableLottieAnimationView2.playAnimation();
                                            break;
                                        case 1:
                                            ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) oVar2.c;
                                            ImageStylingKt.applyStyles(themeableLottieAnimationView3, remoteImage2);
                                            themeableLottieAnimationView3.setRepeatMode(1);
                                            themeableLottieAnimationView3.setRepeatCount(-1);
                                            themeableLottieAnimationView3.playAnimation();
                                            break;
                                        default:
                                            ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) oVar2.c;
                                            ImageStylingKt.applyStyles(themeableLottieAnimationView4, remoteImage2);
                                            themeableLottieAnimationView4.setRepeatMode(1);
                                            themeableLottieAnimationView4.setRepeatCount(-1);
                                            themeableLottieAnimationView4.playAnimation();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                            String url = attributes3.getUrl();
                            ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) inflate.c;
                            url.getClass();
                            JobKt.launch$default(themeableLottieAnimationView2.scope, null, null, new TransitionWorker$run$1(url, themeableLottieAnimationView2, null, 27), 3);
                        } else if (i6 != 3) {
                            inflate = o.inflate$1(layoutInflater);
                            linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i8 = i2;
                                    int i9 = 0;
                                    RemoteImage.Attributes attributes4 = attributes3;
                                    RemoteImage remoteImage2 = remoteImage;
                                    o oVar2 = inflate;
                                    switch (i8) {
                                        case 0:
                                            ImageView imageView = (ImageView) oVar2.c;
                                            ImageStylingKt.applyStyles(imageView, remoteImage2);
                                            String url2 = attributes4.getUrl();
                                            RemoteImage.RemoteImageComponentStyle styles = remoteImage2.getStyles();
                                            Context context2 = imageView.getContext();
                                            context2.getClass();
                                            ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(context2);
                                            ImageRequestsKt.crossfade(imageLoader$Builder);
                                            ((Extras.Builder) imageLoader$Builder.extras).set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(500));
                                            RealImageLoader build = imageLoader$Builder.build();
                                            ImageRequest.Builder builder = new ImageRequest.Builder(imageView.getContext());
                                            builder.data = url2;
                                            ImageRequests_androidKt.target(builder, imageView);
                                            builder.decoderFactory = new RemoteImageComponentKt$$ExternalSyntheticLambda7(styles, i9);
                                            build.enqueue(builder.build());
                                            break;
                                        default:
                                            ImageView imageView2 = (ImageView) oVar2.c;
                                            ImageStylingKt.applyStyles(imageView2, remoteImage2);
                                            String url3 = attributes4 != null ? attributes4.getUrl() : null;
                                            Context context3 = imageView2.getContext();
                                            context3.getClass();
                                            ImageLoader$Builder imageLoader$Builder2 = new ImageLoader$Builder(context3);
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = new ArrayList();
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            arrayList5.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda0(new SvgDecoder.Factory(), 0));
                                            imageLoader$Builder2.componentRegistry = new ComponentRegistry(BundleKt.toImmutableList(arrayList), BundleKt.toImmutableList(arrayList2), BundleKt.toImmutableList(arrayList3), BundleKt.toImmutableList(arrayList4), BundleKt.toImmutableList(arrayList5));
                                            ImageRequestsKt.crossfade(imageLoader$Builder2);
                                            ((Extras.Builder) imageLoader$Builder2.extras).set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(500));
                                            RealImageLoader build2 = imageLoader$Builder2.build();
                                            ImageRequest.Builder builder2 = new ImageRequest.Builder(imageView2.getContext());
                                            builder2.data = url3;
                                            ImageRequests_androidKt.target(builder2, imageView2);
                                            build2.enqueue(builder2.build());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        } else {
                            inflate = o.inflate$1(layoutInflater);
                            linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i8 = i7;
                                    int i9 = 0;
                                    RemoteImage.Attributes attributes4 = attributes3;
                                    RemoteImage remoteImage2 = remoteImage;
                                    o oVar2 = inflate;
                                    switch (i8) {
                                        case 0:
                                            ImageView imageView = (ImageView) oVar2.c;
                                            ImageStylingKt.applyStyles(imageView, remoteImage2);
                                            String url2 = attributes4.getUrl();
                                            RemoteImage.RemoteImageComponentStyle styles = remoteImage2.getStyles();
                                            Context context2 = imageView.getContext();
                                            context2.getClass();
                                            ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(context2);
                                            ImageRequestsKt.crossfade(imageLoader$Builder);
                                            ((Extras.Builder) imageLoader$Builder.extras).set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(500));
                                            RealImageLoader build = imageLoader$Builder.build();
                                            ImageRequest.Builder builder = new ImageRequest.Builder(imageView.getContext());
                                            builder.data = url2;
                                            ImageRequests_androidKt.target(builder, imageView);
                                            builder.decoderFactory = new RemoteImageComponentKt$$ExternalSyntheticLambda7(styles, i9);
                                            build.enqueue(builder.build());
                                            break;
                                        default:
                                            ImageView imageView2 = (ImageView) oVar2.c;
                                            ImageStylingKt.applyStyles(imageView2, remoteImage2);
                                            String url3 = attributes4 != null ? attributes4.getUrl() : null;
                                            Context context3 = imageView2.getContext();
                                            context3.getClass();
                                            ImageLoader$Builder imageLoader$Builder2 = new ImageLoader$Builder(context3);
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = new ArrayList();
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            arrayList5.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda0(new SvgDecoder.Factory(), 0));
                                            imageLoader$Builder2.componentRegistry = new ComponentRegistry(BundleKt.toImmutableList(arrayList), BundleKt.toImmutableList(arrayList2), BundleKt.toImmutableList(arrayList3), BundleKt.toImmutableList(arrayList4), BundleKt.toImmutableList(arrayList5));
                                            ImageRequestsKt.crossfade(imageLoader$Builder2);
                                            ((Extras.Builder) imageLoader$Builder2.extras).set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(500));
                                            RealImageLoader build2 = imageLoader$Builder2.build();
                                            ImageRequest.Builder builder2 = new ImageRequest.Builder(imageView2.getContext());
                                            builder2.data = url3;
                                            ImageRequests_androidKt.target(builder2, imageView2);
                                            build2.enqueue(builder2.build());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        View root = inflate.getRoot();
                        root.getClass();
                        return root;
                    }
                }
                themeableLottieAnimationView = null;
                if (themeableLottieAnimationView == null) {
                }
            }
        }
        view = null;
        if (view == null) {
        }
    }

    public static final String replaceHexCodes(String str, String str2, String str3, String str4) {
        try {
            Color.parseColor(str3);
            return StringsKt__StringsJVMKt.replace$default(str, str2, str3);
        } catch (IllegalArgumentException unused) {
            return StringsKt__StringsJVMKt.replace$default(str, str2, str4);
        }
    }
}
