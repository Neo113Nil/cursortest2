package papa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.InputEvent;
import android.view.View;
import android.view.Window;
import app.cash.arcade.values.Attribute;
import app.cash.arcade.values.AttributeRange;
import app.cash.arcade.values.AttributedString;
import app.cash.broadway.navigation.Navigator;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry;
import com.bumptech.glide.provider.ResourceEncoderRegistry$Entry;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityItemEventHandlerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.markdown.views.BulletSpan;
import com.squareup.cash.markdown.views.NumberedBulletSpan;
import com.squareup.cash.markdownparser.MarkdownParserKt;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class InputEventTrigger {
    public final ArrayList inputEventFrameRenderedCallbacks;

    public abstract class Companion {
        /* renamed from: createTrackingWhenFrameRendered-SxA4cEA, reason: not valid java name */
        public static InputEventTrigger m4369createTrackingWhenFrameRenderedSxA4cEA(Window window, InputEvent inputEvent) {
            inputEvent.getClass();
            final InputEventTrigger inputEventTrigger = new InputEventTrigger(0);
            Choreographers choreographers = Choreographers.INSTANCE;
            OnFrameRenderedListener onFrameRenderedListener = new OnFrameRenderedListener() { // from class: papa.InputEventTrigger$Companion$createTrackingWhenFrameRendered$1
                @Override // papa.OnFrameRenderedListener
                /* renamed from: onFrameRendered-LRDsOJo, reason: not valid java name */
                public final void mo4370onFrameRenderedLRDsOJo(long j) {
                    ArrayList arrayList = InputEventTrigger.this.inputEventFrameRenderedCallbacks;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((OnFrameRenderedListener) it.next()).mo4370onFrameRenderedLRDsOJo(j);
                    }
                    arrayList.clear();
                }
            };
            choreographers.getClass();
            AppUpdateData.onNextPreDraw(window, new Choreographers$$ExternalSyntheticLambda1(onFrameRenderedListener, 0));
            return inputEventTrigger;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.cash.activity.presenters.ActivityItemEventHandlerKt$$ExternalSyntheticLambda0] */
        public static final ActivityItemEventHandlerKt$$ExternalSyntheticLambda0 decoratedWith(final ActivityItemEventHandler.Factory factory, final ActivityItemEventDecorator activityItemEventDecorator) {
            factory.getClass();
            activityItemEventDecorator.getClass();
            return new ActivityItemEventHandler.Factory() { // from class: com.squareup.cash.activity.presenters.ActivityItemEventHandlerKt$$ExternalSyntheticLambda0
                @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler.Factory
                public final ActivityItemEventHandler create(Navigator navigator, Function1 function1) {
                    navigator.getClass();
                    final ActivityItemEventHandler create = ActivityItemEventHandler.Factory.this.create(navigator, function1);
                    final ActivityItemEventDecorator activityItemEventDecorator2 = activityItemEventDecorator;
                    return new ActivityItemEventHandler() { // from class: com.squareup.cash.activity.presenters.ActivityItemEventHandlerKt$$ExternalSyntheticLambda1
                        @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler
                        public final Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
                            activityItemViewModel.getClass();
                            activityItemViewEvent.getClass();
                            activityItem.getClass();
                            return ActivityItemEventDecorator.this.decorate(create, activityItemViewModel, activityItemViewEvent, activityItem);
                        }
                    };
                }
            };
        }

        public static String getPackageName(Context context) {
            PackageManager packageManager = context.getPackageManager();
            ArrayList<String> arrayList = new ArrayList();
            ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(str);
                arrayList = arrayList2;
            }
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            for (String str2 : arrayList) {
                intent.setPackage(str2);
                if (packageManager.resolveService(intent, 0) != null) {
                    return str2;
                }
            }
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }

        public static SpannedString markdownToSpanned$default(String str, Context context, Function1 function1, int i) {
            Integer num = (i & 8) != 0 ? null : 0;
            if ((i & 16) != 0) {
                function1 = null;
            }
            str.getClass();
            context.getClass();
            return toSpannedString(MarkdownParserKt.parseMarkdownWith(str, MarkdownParserKt.multiblockMarkdownRegex), context, num, function1);
        }

        public static final SpannedString toSpannedString(AttributedString attributedString, Context context, Integer num, final Function1 function1) {
            Object foregroundColorSpan;
            Object bulletSpan;
            attributedString.getClass();
            context.getClass();
            ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
            ColorPalette colorPalette = findThemeInfo.colorPalette;
            SpannableString spannableString = new SpannableString(attributedString.text);
            for (AttributeRange attributeRange : attributedString.attributeRanges) {
                final Attribute attribute = attributeRange.attribute;
                int i = attributeRange.endIndexExclusive;
                int i2 = attributeRange.beginIndexInclusive;
                boolean z = attribute instanceof Attribute.OrderedListItem;
                if (z) {
                    spannableString.setSpan(new TtsSpan.TextBuilder(((Attribute.OrderedListItem) attribute).number).build(), i2, i2, 34);
                }
                if (Intrinsics.areEqual(attribute, Attribute.StrikeThrough.INSTANCE)) {
                    bulletSpan = new StrikethroughSpan();
                } else if (Intrinsics.areEqual(attribute, Attribute.Faded.INSTANCE)) {
                    bulletSpan = new ForegroundColorSpan(colorPalette.disabledLabel);
                } else if (Intrinsics.areEqual(attribute, Attribute.Underline.INSTANCE)) {
                    bulletSpan = new UnderlineSpan();
                } else if (Intrinsics.areEqual(attribute, Attribute.Bold.INSTANCE)) {
                    bulletSpan = new StyleSpan(1);
                } else {
                    if (attribute instanceof Attribute.Link) {
                        foregroundColorSpan = new ClickableSpan() { // from class: com.squareup.cash.markdown.views.MarkdownsKt$toSpan$1
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                Attribute attribute2 = attribute;
                                view.getClass();
                                try {
                                    Function1 function12 = Function1.this;
                                    if (function12 != null) {
                                        function12.invoke(((Attribute.Link) attribute2).url);
                                    }
                                } catch (Exception e) {
                                    Timber.Forest.e("Error updating new url: %s", new Object[]{((Attribute.Link) attribute2).url}, e);
                                }
                            }
                        };
                    } else if (z) {
                        foregroundColorSpan = new NumberedBulletSpan(((Attribute.OrderedListItem) attribute).number, context, num);
                    } else if (Intrinsics.areEqual(attribute, Attribute.UnorderedListItem.INSTANCE)) {
                        bulletSpan = new BulletSpan(context, num);
                    } else {
                        if (!(attribute instanceof Attribute.ForegroundColor)) {
                            if (attribute instanceof Attribute.Icon) {
                                throw new NotImplementedError(null, 1, null);
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        foregroundColorSpan = new ForegroundColorSpan(ColorsKt.toColorInt$default(((Attribute.ForegroundColor) attribute).color, findThemeInfo));
                    }
                    bulletSpan = foregroundColorSpan;
                }
                spannableString.setSpan(bulletSpan, i2, i, 17);
            }
            return new SpannedString(spannableString);
        }
    }

    public InputEventTrigger(int i) {
        switch (i) {
            case 1:
                this.inputEventFrameRenderedCallbacks = new ArrayList();
                break;
            case 2:
                this.inputEventFrameRenderedCallbacks = new ArrayList();
                break;
            default:
                this.inputEventFrameRenderedCallbacks = CollectionsKt__CollectionsKt.mutableListOf(new InputEventTrigger$inputEventFrameRenderedCallbacks$1());
                break;
        }
    }

    public synchronized ResourceEncoder get(Class cls) {
        int size = this.inputEventFrameRenderedCallbacks.size();
        for (int i = 0; i < size; i++) {
            ResourceEncoderRegistry$Entry resourceEncoderRegistry$Entry = (ResourceEncoderRegistry$Entry) this.inputEventFrameRenderedCallbacks.get(i);
            if (resourceEncoderRegistry$Entry.resourceClass.isAssignableFrom(cls)) {
                return resourceEncoderRegistry$Entry.encoder;
            }
        }
        return null;
    }

    public synchronized ArrayList getTranscodeClasses(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.inputEventFrameRenderedCallbacks.iterator();
        while (it.hasNext()) {
            TranscoderRegistry$Entry transcoderRegistry$Entry = (TranscoderRegistry$Entry) it.next();
            if ((transcoderRegistry$Entry.fromClass.isAssignableFrom(cls) && cls2.isAssignableFrom(transcoderRegistry$Entry.toClass)) && !arrayList.contains(transcoderRegistry$Entry.toClass)) {
                arrayList.add(transcoderRegistry$Entry.toClass);
            }
        }
        return arrayList;
    }
}
