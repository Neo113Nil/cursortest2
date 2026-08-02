package com.withpersona.sdk2.inquiry.internal.network;

import android.os.Parcelable;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.governmentid.DesignVersion;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.OverridableText;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonActionComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class ConversionsKt {
    public static final OverridableText to$overrideBySideAndId(String str, String str2, String str3, List list) {
        if (str == null) {
            str = "";
        }
        EnumEntriesList enumEntriesList = IdConfig.Side.$ENTRIES;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        ArrayIterator arrayIterator = new ArrayIterator(enumEntriesList);
        while (arrayIterator.hasNext()) {
            linkedHashMap.put(new Pair((IdConfig.Side) arrayIterator.next(), str2), str);
        }
        return to$overrideTextBySideAndId(str3, list, linkedHashMap);
    }

    public static final OverridableText to$overrideTextBySideAndId(String str, List list, Map map) {
        ArrayList arrayList;
        ArrayList<NextStep.GovernmentId.LocalizationOverride> arrayList2;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(3);
        for (Map.Entry entry : map.entrySet()) {
            Pair pair = (Pair) entry.getKey();
            String str2 = (String) entry.getValue();
            IdConfig.Side side = (IdConfig.Side) pair.first;
            String str3 = (String) pair.second;
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj2;
                    if (Intrinsics.areEqual(localizationOverride.getSide(), side.key) || localizationOverride.getSide() == null) {
                        if (Intrinsics.areEqual(localizationOverride.getKey(), str3)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            } else {
                arrayList2 = null;
            }
            chunkIndexMerger.putText(null, null, side, str2);
            if (arrayList2 != null) {
                for (NextStep.GovernmentId.LocalizationOverride localizationOverride2 : arrayList2) {
                    chunkIndexMerger.putText(localizationOverride2.getCountryCode(), localizationOverride2.getIdClass(), side, localizationOverride2.getText());
                }
            }
        }
        return new OverridableText(chunkIndexMerger.chunkMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LinkedHashMap toInquiryFieldDtoMap(Map map) {
        Object unknown;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            InquiryField inquiryField = (InquiryField) entry.getValue();
            inquiryField.getClass();
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            int i = 2;
            if (inquiryField instanceof InquiryField.BooleanField) {
                unknown = new InquiryField.BooleanField(((InquiryField.BooleanField) inquiryField).getValue(), str, i, objArr15 == true ? 1 : 0);
            } else if (inquiryField instanceof InquiryField.ChoicesField) {
                unknown = new InquiryField.ChoicesField(((InquiryField.ChoicesField) inquiryField).getValue(), objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0);
            } else if (inquiryField instanceof InquiryField.DateField) {
                unknown = new InquiryField.DateField(String.valueOf(((InquiryField.DateField) inquiryField).getValue()), objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0);
            } else if (inquiryField instanceof InquiryField.DatetimeField) {
                unknown = new InquiryField.DatetimeField(String.valueOf(((InquiryField.DatetimeField) inquiryField).getValue()), objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0);
            } else if (inquiryField instanceof InquiryField.FloatField) {
                unknown = new InquiryField.FloatField(((InquiryField.FloatField) inquiryField).getValue(), objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0);
            } else if (inquiryField instanceof InquiryField.IntegerField) {
                unknown = new InquiryField.IntegerField(((InquiryField.IntegerField) inquiryField).getValue(), objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0);
            } else if (inquiryField instanceof InquiryField.MultiChoicesField) {
                unknown = new InquiryField.MultiChoicesField(((InquiryField.MultiChoicesField) inquiryField).getValue(), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
            } else if (inquiryField instanceof InquiryField.StringField) {
                unknown = new InquiryField.StringField(((InquiryField.StringField) inquiryField).getValue(), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            } else {
                if (!(inquiryField instanceof InquiryField.UnknownField)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                unknown = new InquiryField.Unknown(((InquiryField.UnknownField) inquiryField).getType());
            }
            linkedHashMap.put(key, unknown);
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap toInquiryFieldSdkMap(Map map) {
        Parcelable unknownField;
        Parcelable datetimeField;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            com.withpersona.sdk2.inquiry.network.dto.InquiryField inquiryField = (com.withpersona.sdk2.inquiry.network.dto.InquiryField) entry.getValue();
            inquiryField.getClass();
            if (inquiryField instanceof InquiryField.BooleanField) {
                unknownField = new InquiryField.BooleanField(((InquiryField.BooleanField) inquiryField).getValue());
            } else if (inquiryField instanceof InquiryField.ChoicesField) {
                unknownField = new InquiryField.ChoicesField(((InquiryField.ChoicesField) inquiryField).getValue());
            } else if (inquiryField instanceof InquiryField.DateField) {
                String value = ((InquiryField.DateField) inquiryField).getValue();
                if (value != null) {
                    datetimeField = new InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(value));
                    unknownField = datetimeField;
                } else {
                    unknownField = new InquiryField.DateField(null);
                }
            } else if (inquiryField instanceof InquiryField.DatetimeField) {
                String value2 = ((InquiryField.DatetimeField) inquiryField).getValue();
                if (value2 != null) {
                    datetimeField = new InquiryField.DatetimeField(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(value2));
                    unknownField = datetimeField;
                } else {
                    unknownField = new InquiryField.DatetimeField(null);
                }
            } else if (inquiryField instanceof InquiryField.FloatField) {
                unknownField = new InquiryField.FloatField(((InquiryField.FloatField) inquiryField).getValue());
            } else if (inquiryField instanceof InquiryField.IntegerField) {
                unknownField = new InquiryField.IntegerField(((InquiryField.IntegerField) inquiryField).getValue());
            } else if (inquiryField instanceof InquiryField.MultiChoicesField) {
                unknownField = new InquiryField.MultiChoicesField(((InquiryField.MultiChoicesField) inquiryField).getValue());
            } else if (inquiryField instanceof InquiryField.StringField) {
                unknownField = new InquiryField.StringField(((InquiryField.StringField) inquiryField).getValue());
            } else {
                if (!(inquiryField instanceof InquiryField.Unknown)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                unknownField = new InquiryField.UnknownField(((InquiryField.Unknown) inquiryField).getType());
            }
            linkedHashMap.put(key, unknownField);
        }
        return linkedHashMap;
    }

    public static final InquiryState.DocumentStepRunning toInquiryState(NextStep.Document document, String str, String str2, InquirySessionConfig inquirySessionConfig) {
        char c;
        char c2;
        char c3;
        int i;
        NextStep.Document.Pages pages;
        StyleElements.SimpleElementColor simpleElementColor;
        NextStep.Document.Localizations localizations;
        StepStyles.DocumentStepStyle documentStepStyle;
        StepStyles.DocumentStepStyle documentStepStyle2;
        NextStep.CancelDialog cancelDialog;
        String str3;
        String str4;
        DocumentStartPage documentStartPage;
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        StepStyles.DocumentStepFillColor fillColor;
        StepStyles.DocumentStepStrokeColor strokeColor;
        UploadOptionsDialog uploadOptionsDialog;
        ButtonCancelComponentStyle buttonSecondaryStyleValue2;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue2;
        NextStep.Document.Pages.DocumentPages document2;
        NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog2;
        NextStep.Document.Pages.DocumentPages document3;
        NextStep.Document.Pages.DocumentStartPage prompt;
        str.getClass();
        str2.getClass();
        inquirySessionConfig.getClass();
        String name = document.getName();
        String name2 = document.getName();
        StepStyles.DocumentStepStyle styles = document.getStyles();
        NextStep.CancelDialog cancelDialog2 = document.getConfig().getLocalizations().getCancelDialog();
        NextStep.Document.Pages pages2 = document.getConfig().getPages();
        NextStep.Document.Localizations localizations2 = document.getConfig().getLocalizations();
        StepStyles.DocumentStepStyle styles2 = document.getStyles();
        localizations2.getClass();
        StyleElements.SimpleElementColor simpleElementColor2 = null;
        if (pages2 == null || (document3 = pages2.getDocument()) == null || (prompt = document3.getPrompt()) == null) {
            String title = localizations2.getPromptPage().getTitle();
            String prompt2 = localizations2.getPromptPage().getPrompt();
            String btnUpload = localizations2.getPromptPage().getBtnUpload();
            String btnCapture = localizations2.getPromptPage().getBtnCapture();
            c = 2;
            c2 = 1;
            Title title2 = new Title("title", new Title.Attributes(title == null ? "" : title, null, null, 6, null), styles2 != null ? styles2.getTitleStyleValue() : null);
            Text.Attributes attributes = new Text.Attributes(prompt2 == null ? "" : prompt2, null, null, 6, null);
            c3 = 0;
            i = 3;
            Text text = new Text("body", attributes, styles2 != null ? styles2.getTextStyleValue() : null);
            LocalImage.Attributes attributes2 = new LocalImage.Attributes(LocalImage.Image.DOCUMENT_START_HERO, null);
            if (styles2 != null && (strokeColor = styles2.getStrokeColor()) != null) {
                simpleElementColor2 = strokeColor.getBase();
            }
            AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = new AttributeStyles.LocalImageStrokeColorStyle(simpleElementColor2);
            if (styles2 == null || (fillColor = styles2.getFillColor()) == null) {
                pages = pages2;
                simpleElementColor = null;
            } else {
                pages = pages2;
                simpleElementColor = fillColor.getBase();
            }
            localizations = localizations2;
            documentStepStyle = styles2;
            documentStepStyle2 = styles;
            cancelDialog = cancelDialog2;
            str3 = name;
            str4 = name2;
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new UiComponentConfig[]{title2, text, new LocalImage("hero_image", attributes2, new LocalImageComponentStyle(localImageStrokeColorStyle, new AttributeStyles.LocalImageFillColorStyle(simpleElementColor, null), null, null, null, new AttributeStyles.LocalImageMarginStyle(new StyleElements.MeasurementSet(new StyleElements.SizeSet(new StyleElements.DPSize(24.0d), new StyleElements.DPSize(24.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d)))), 28, null)), new CombinedStepButton("camera_button", new BasicButtonAttributes(btnCapture == null ? "" : btnCapture, Button.ButtonType.PRIMARY, null, null, null, null, 60, null), (documentStepStyle == null || (buttonPrimaryStyleValue = documentStepStyle.getButtonPrimaryStyleValue()) == null) ? null : com.withpersona.sdk2.inquiry.document.ConversionsKt.to(buttonPrimaryStyleValue)), new CombinedStepButton("upload_button", new BasicButtonAttributes(btnUpload == null ? "" : btnUpload, Button.ButtonType.SECONDARY, null, null, null, null, 60, null), (documentStepStyle == null || (buttonSecondaryStyleValue = documentStepStyle.getButtonSecondaryStyleValue()) == null) ? null : com.withpersona.sdk2.inquiry.document.ConversionsKt.to(buttonSecondaryStyleValue))});
            documentStartPage = new DocumentStartPage(UiComponentKt.to(listOf), listOf, new StepStyles.UiStepStyle(documentStepStyle != null ? documentStepStyle.getHeaderButtonColor() : null, documentStepStyle != null ? documentStepStyle.getBackgroundColor() : null, documentStepStyle != null ? documentStepStyle.getBackgroundImage() : null, null, null, null, null, null, null, null, null, null), "upload_button", null, "camera_button", null);
        } else {
            List<UiComponentConfig> components = prompt.getUiStep().getConfig().getComponents();
            ArrayList arrayList = components != null ? UiComponentKt.to(components) : null;
            List<UiComponentConfig> components2 = prompt.getUiStep().getConfig().getComponents();
            if (components2 == null) {
                components2 = EmptyList.INSTANCE;
            }
            List<UiComponentConfig> list = components2;
            StepStyles.UiStepStyle styles3 = prompt.getUiStep().getStyles();
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping = prompt.getComponentNameMapping();
            String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping2 = prompt.getComponentNameMapping();
            String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping3 = prompt.getComponentNameMapping();
            String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping4 = prompt.getComponentNameMapping();
            pages = pages2;
            localizations = localizations2;
            documentStepStyle = styles2;
            documentStepStyle2 = styles;
            cancelDialog = cancelDialog2;
            str3 = name;
            str4 = name2;
            documentStartPage = new DocumentStartPage(arrayList, list, styles3, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonUploadOptions() : null);
            c3 = 0;
            c = 2;
            c2 = 1;
            i = 3;
        }
        if (pages == null || (document2 = pages.getDocument()) == null || (uploadOptionsDialog2 = document2.getUploadOptionsDialog()) == null) {
            String captureOptionsDialogTitle = localizations.getPromptPage().getCaptureOptionsDialogTitle();
            String btnCapture2 = localizations.getPromptPage().getBtnCapture();
            String btnUpload2 = localizations.getPromptPage().getBtnUpload();
            Title title3 = new Title("title", new Title.Attributes(captureOptionsDialogTitle == null ? "" : captureOptionsDialogTitle, null, null, 6, null), documentStepStyle != null ? documentStepStyle.getTitleStyleValue() : null);
            CombinedStepButton combinedStepButton = new CombinedStepButton("take_photo", new BasicButtonAttributes(btnCapture2 == null ? "" : btnCapture2, Button.ButtonType.PRIMARY, null, null, null, null, 60, null), (documentStepStyle == null || (buttonPrimaryStyleValue2 = documentStepStyle.getButtonPrimaryStyleValue()) == null) ? null : com.withpersona.sdk2.inquiry.document.ConversionsKt.to(buttonPrimaryStyleValue2));
            CombinedStepButton combinedStepButton2 = new CombinedStepButton("select_file", new BasicButtonAttributes(btnUpload2 == null ? "" : btnUpload2, Button.ButtonType.SECONDARY, null, null, null, null, 60, null), (documentStepStyle == null || (buttonSecondaryStyleValue2 = documentStepStyle.getButtonSecondaryStyleValue()) == null) ? null : com.withpersona.sdk2.inquiry.document.ConversionsKt.to(buttonSecondaryStyleValue2));
            UiComponentConfig[] uiComponentConfigArr = new UiComponentConfig[i];
            uiComponentConfigArr[c3] = title3;
            uiComponentConfigArr[c2] = combinedStepButton;
            uiComponentConfigArr[c] = combinedStepButton2;
            List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) uiComponentConfigArr);
            uploadOptionsDialog = new UploadOptionsDialog(UiComponentKt.to(listOf2), listOf2, new StepStyles.UiStepStyle(documentStepStyle != null ? documentStepStyle.getHeaderButtonColor() : null, documentStepStyle != null ? documentStepStyle.getBackgroundColor() : null, documentStepStyle != null ? documentStepStyle.getBackgroundImage() : null, null, null, null, null, null, null, null, null, null), "select_file", null, "take_photo", null);
        } else {
            List<UiComponentConfig> components3 = uploadOptionsDialog2.getUiStep().getConfig().getComponents();
            ArrayList arrayList2 = components3 != null ? UiComponentKt.to(components3) : null;
            List<UiComponentConfig> components4 = uploadOptionsDialog2.getUiStep().getConfig().getComponents();
            if (components4 == null) {
                components4 = EmptyList.INSTANCE;
            }
            List<UiComponentConfig> list2 = components4;
            StepStyles.UiStepStyle styles4 = uploadOptionsDialog2.getUiStep().getStyles();
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping5 = uploadOptionsDialog2.getComponentNameMapping();
            String buttonPhotoLibrary2 = componentNameMapping5 != null ? componentNameMapping5.getButtonPhotoLibrary() : null;
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping6 = uploadOptionsDialog2.getComponentNameMapping();
            String buttonFilePicker2 = componentNameMapping6 != null ? componentNameMapping6.getButtonFilePicker() : null;
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping7 = uploadOptionsDialog2.getComponentNameMapping();
            String buttonCamera2 = componentNameMapping7 != null ? componentNameMapping7.getButtonCamera() : null;
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping8 = uploadOptionsDialog2.getComponentNameMapping();
            uploadOptionsDialog = new UploadOptionsDialog(arrayList2, list2, styles4, buttonFilePicker2, buttonPhotoLibrary2, buttonCamera2, componentNameMapping8 != null ? componentNameMapping8.getButtonCancel() : null);
        }
        return new InquiryState.DocumentStepRunning(str2, str, null, documentStepStyle2, cancelDialog, document, str3, new DocumentPages(documentStartPage, uploadOptionsDialog), document.getConfig().getAssets(), str4, inquirySessionConfig);
    }

    public static final InquiryState.GovernmentIdStepRunning toInquiryState(NextStep.GovernmentId governmentId, String str, String str2, String str3, InquirySessionConfig inquirySessionConfig) {
        NextStep.CancelDialog cancelDialog;
        boolean z;
        CapturePageConfig capturePageConfig;
        str.getClass();
        str2.getClass();
        inquirySessionConfig.getClass();
        Long nativeMobileCameraManualCaptureDelayMs = governmentId.getConfig().getNativeMobileCameraManualCaptureDelayMs();
        long longValue = nativeMobileCameraManualCaptureDelayMs != null ? nativeMobileCameraManualCaptureDelayMs.longValue() : 8000L;
        List<Id> idclasses = governmentId.getConfig().getIdclasses();
        if (idclasses == null) {
            idclasses = EmptyList.INSTANCE;
        }
        List<Id> list = idclasses;
        String name = governmentId.getName();
        String name2 = governmentId.getName();
        Boolean backStepEnabled = governmentId.getConfig().getBackStepEnabled();
        boolean booleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = governmentId.getConfig().getCancelButtonEnabled();
        boolean booleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        NextStep.GovernmentId.Localizations localizations = governmentId.getConfig().getLocalizations();
        List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides = governmentId.getConfig().getLocalizationOverrides();
        List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile = governmentId.getConfig().getEnabledCaptureOptionsNativeMobile();
        if (enabledCaptureOptionsNativeMobile == null) {
            enabledCaptureOptionsNativeMobile = CollectionsKt__CollectionsJVMKt.listOf(CaptureOptionNativeMobile.MOBILE_CAMERA);
        }
        List<CaptureOptionNativeMobile> list2 = enabledCaptureOptionsNativeMobile;
        StepStyles.GovernmentIdStepStyle styles = governmentId.getStyles();
        Integer imageCaptureCount = governmentId.getConfig().getImageCaptureCount();
        int intValue = imageCaptureCount != null ? imageCaptureCount.intValue() : 3;
        String fieldKeyDocument = governmentId.getConfig().getFieldKeyDocument();
        String fieldKeyIdclass = governmentId.getConfig().getFieldKeyIdclass();
        NextStep.CancelDialog cancelDialog2 = governmentId.getConfig().getLocalizations().getCancelDialog();
        Boolean shouldSkipReviewScreen = governmentId.getConfig().getShouldSkipReviewScreen();
        if (shouldSkipReviewScreen != null) {
            cancelDialog = cancelDialog2;
            z = shouldSkipReviewScreen.booleanValue();
        } else {
            cancelDialog = cancelDialog2;
            z = false;
        }
        List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes = governmentId.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = EmptyList.INSTANCE;
        }
        List<NextStep.GovernmentId.CaptureFileType> list3 = enabledCaptureFileTypes;
        List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods = governmentId.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = EmptyList.INSTANCE;
        }
        List<NextStep.GovernmentId.VideoCaptureMethod> list4 = videoCaptureMethods;
        String videoSessionJwt = governmentId.getConfig().getVideoSessionJwt();
        NextStep.GovernmentId.AssetConfig assets = governmentId.getConfig().getAssets();
        NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig = governmentId.getConfig().getAutoClassificationConfig();
        IdConfig.IdSideConfig idSideConfig = null;
        Boolean isEnabled = autoClassificationConfig != null ? autoClassificationConfig.isEnabled() : null;
        Boolean extractTextFromImage = autoClassificationConfig != null ? autoClassificationConfig.getExtractTextFromImage() : null;
        if (autoClassificationConfig != null && (capturePageConfig = autoClassificationConfig.getCapturePageConfig()) != null) {
            idSideConfig = com.withpersona.sdk2.inquiry.governmentid.ConversionsKt.to(capturePageConfig, IdConfig.Side.Front, IdClass.Unknown, "", longValue);
        }
        boolean booleanValue3 = isEnabled != null ? isEnabled.booleanValue() : false;
        boolean booleanValue4 = extractTextFromImage != null ? extractTextFromImage.booleanValue() : true;
        if (idSideConfig == null) {
            idSideConfig = new IdConfig.IdSideConfig("unknown", IdConfig.Side.Front, Screen.Overlay.CornersOnly.INSTANCE, new IdConfig.AutoCaptureConfig(), new IdConfig.ManualCaptureConfig(true, 0L));
        }
        AutoClassificationConfig autoClassificationConfig2 = new AutoClassificationConfig(booleanValue3, booleanValue4, idSideConfig);
        StyleElements.Axis reviewCaptureButtonsAxis = governmentId.getConfig().getReviewCaptureButtonsAxis();
        if (reviewCaptureButtonsAxis == null) {
            reviewCaptureButtonsAxis = StyleElements.Axis.HORIZONTAL;
        }
        StyleElements.Axis axis = reviewCaptureButtonsAxis;
        PendingPageTextPosition pendingPageTextVerticalPosition = governmentId.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = governmentId.getConfig().getAudioEnabled();
        boolean booleanValue5 = audioEnabled != null ? audioEnabled.booleanValue() : true;
        Boolean staticCaptureTipsEnabled = governmentId.getConfig().getStaticCaptureTipsEnabled();
        return new InquiryState.GovernmentIdStepRunning(str2, str, null, styles, cancelDialog, str3, list, name, name2, booleanValue, booleanValue2, localizations, localizationOverrides, list2, intValue, longValue, fieldKeyDocument, fieldKeyIdclass, z, list3, list4, videoSessionJwt, assets, autoClassificationConfig2, axis, pendingPageTextPosition, booleanValue5, null, staticCaptureTipsEnabled != null ? staticCaptureTipsEnabled.booleanValue() : false, governmentId.getConfig().getHolographicTorchEnabledDurationMs(), inquirySessionConfig, Intrinsics.areEqual(governmentId.getConfig().getGovidDesignVersion(), "K0000") ? DesignVersion.K0000 : DesignVersion.V0, governmentId.getConfig().getFlowWatermarkText(), governmentId.getConfig().getSilentNetworkAuthenticationCheckUrl(), governmentId.getConfig().getSilentNetworkAuthenticationBackgroundTimeoutSeconds());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InquiryState.SelfieStepRunning toInquiryState(NextStep.Selfie selfie, String str, String str2, InquirySessionConfig inquirySessionConfig) {
        com.withpersona.sdk2.inquiry.selfie.DesignVersion designVersion;
        Iterator<PoseConfig> it;
        Selfie.Pose pose;
        str.getClass();
        str2.getClass();
        inquirySessionConfig.getClass();
        NextStep.Selfie.CaptureMethod selfieType = selfie.getConfig().getSelfieType();
        String name = selfie.getName();
        String name2 = selfie.getName();
        Boolean backStepEnabled = selfie.getConfig().getBackStepEnabled();
        boolean booleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = selfie.getConfig().getCancelButtonEnabled();
        boolean booleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String fieldKeySelfie = selfie.getConfig().getFieldKeySelfie();
        boolean requireStrictSelfieCapture = selfie.getConfig().getRequireStrictSelfieCapture();
        Boolean skipPromptPage = selfie.getConfig().getSkipPromptPage();
        boolean booleanValue3 = skipPromptPage != null ? skipPromptPage.booleanValue() : false;
        NextStep.Selfie.Localizations localizations = selfie.getConfig().getLocalizations();
        StepStyles.SelfieStepStyle styles = selfie.getStyles();
        NextStep.CancelDialog cancelDialog = selfie.getConfig().getLocalizations().getCancelDialog();
        List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes = selfie.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = EmptyList.INSTANCE;
        }
        List<NextStep.Selfie.CaptureFileType> list = enabledCaptureFileTypes;
        List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods = selfie.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = EmptyList.INSTANCE;
        }
        List<NextStep.Selfie.VideoCaptureMethod> list2 = videoCaptureMethods;
        NextStep.Selfie.AssetConfig assets = selfie.getConfig().getAssets();
        String videoSessionJwt = selfie.getConfig().getVideoSessionJwt();
        List<NextStep.Selfie.SelfiePose> orderedPoses = selfie.getConfig().getOrderedPoses();
        PendingPageTextPosition pendingPageTextVerticalPosition = selfie.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = selfie.getConfig().getAudioEnabled();
        boolean booleanValue4 = audioEnabled != null ? audioEnabled.booleanValue() : true;
        List<PoseConfig> poseConfigs = selfie.getConfig().getPoseConfigs();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (poseConfigs == null) {
            poseConfigs = EmptyList.INSTANCE;
        }
        Iterator<PoseConfig> it2 = poseConfigs.iterator();
        while (it2.hasNext()) {
            PoseConfig next = it2.next();
            String pose2 = next.getPose();
            if (pose2 != null) {
                int hashCode = pose2.hashCode();
                it = it2;
                if (hashCode == -1364013995) {
                    if (pose2.equals("center")) {
                        pose = Selfie.Pose.Center;
                        if (pose != null) {
                        }
                    }
                    pose = null;
                    if (pose != null) {
                    }
                } else if (hashCode != 3317767) {
                    if (hashCode == 108511772 && pose2.equals("right")) {
                        pose = Selfie.Pose.Right;
                        if (pose != null) {
                            Boolean allowReview = next.getAllowReview();
                            boolean booleanValue5 = allowReview != null ? allowReview.booleanValue() : false;
                            Boolean manualCaptureEnabled = next.getManualCaptureEnabled();
                            boolean booleanValue6 = manualCaptureEnabled != null ? manualCaptureEnabled.booleanValue() : true;
                            Long manualCaptureDelayMs = next.getManualCaptureDelayMs();
                            long longValue = manualCaptureDelayMs != null ? manualCaptureDelayMs.longValue() : 8000L;
                            Boolean autoCaptureEnabled = next.getAutoCaptureEnabled();
                            linkedHashMap.put(pose, new com.withpersona.sdk2.inquiry.selfie.PoseConfig(booleanValue5, booleanValue6, longValue, autoCaptureEnabled != null ? autoCaptureEnabled.booleanValue() : true));
                        }
                    }
                    pose = null;
                    if (pose != null) {
                    }
                } else {
                    if (pose2.equals("left")) {
                        pose = Selfie.Pose.Left;
                        if (pose != null) {
                        }
                    }
                    pose = null;
                    if (pose != null) {
                    }
                }
            } else {
                it = it2;
            }
            it2 = it;
        }
        PoseConfigs poseConfigs2 = new PoseConfigs(linkedHashMap);
        String designVersion2 = selfie.getConfig().getDesignVersion();
        if (Intrinsics.areEqual(designVersion2, "K0000")) {
            designVersion = com.withpersona.sdk2.inquiry.selfie.DesignVersion.K0000;
        } else {
            designVersion = Intrinsics.areEqual(designVersion2, "0") ? com.withpersona.sdk2.inquiry.selfie.DesignVersion.V0 : com.withpersona.sdk2.inquiry.selfie.DesignVersion.V1;
        }
        return new InquiryState.SelfieStepRunning(str2, str, null, styles, cancelDialog, selfieType, name, name2, booleanValue, booleanValue2, fieldKeySelfie, requireStrictSelfieCapture, booleanValue3, localizations, list, list2, assets, videoSessionJwt, orderedPoses, pendingPageTextPosition, booleanValue4, poseConfigs2, designVersion, inquirySessionConfig, selfie.getConfig().getImageUploadUrl(), selfie.getConfig().getFlowWatermarkText(), selfie.getConfig().getSilentNetworkAuthenticationCheckUrl(), selfie.getConfig().getSilentNetworkAuthenticationBackgroundTimeoutSeconds());
    }

    public static final InquiryState.IntegrationStepRunning toInquiryState(NextStep.Integration integration, String str, String str2, String str3, InquirySessionConfig inquirySessionConfig) {
        Title title;
        StepStyles.IntegrationStepStyle integrationStepStyle;
        NextStep.CancelDialog cancelDialog;
        ButtonActionComponentStyle buttonActionComponentStyle;
        String str4;
        StyleElements.SizeSet sizeSet;
        StepStyles.StepPaddingStyle padding;
        StepStyles.StepPaddingStyleContainer modal;
        StepStyles.StepBackgroundColorStyle backgroundColor;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        str.getClass();
        str2.getClass();
        inquirySessionConfig.getClass();
        String str5 = str3 == null ? "" : str3;
        String name = integration.getName();
        String type2 = integration.getConfig().getType();
        String flowUrl = integration.getConfig().getFlowUrl();
        String redirectPath = integration.getConfig().getRedirectPath();
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = integration.getConfig().getIntegrationStepBrowserType();
        if (integrationStepBrowserType == null) {
            integrationStepBrowserType = NextStep.Integration.IntegrationStepBrowserType.AuthSession;
        }
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType2 = integrationStepBrowserType;
        Boolean backStepEnabled = integration.getConfig().getBackStepEnabled();
        boolean booleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = integration.getConfig().getCancelButtonEnabled();
        boolean booleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        NextStep.Integration.Localizations localizations = integration.getConfig().getLocalizations();
        NextStep.CancelDialog cancelDialog2 = localizations != null ? localizations.getCancelDialog() : null;
        NextStep.Integration.Localizations localizations2 = integration.getConfig().getLocalizations();
        StepStyles.IntegrationStepStyle styles = integration.getStyles();
        NextStep.Integration.Localizations localizations3 = integration.getConfig().getLocalizations();
        NextStep.Integration.PendingPage pendingPage = localizations3 != null ? localizations3.getPendingPage() : null;
        StepStyles.IntegrationStepStyle styles2 = integration.getStyles();
        String title2 = pendingPage != null ? pendingPage.getTitle() : null;
        String descriptionMobile = pendingPage != null ? pendingPage.getDescriptionMobile() : null;
        String btnLaunchMobile = pendingPage != null ? pendingPage.getBtnLaunchMobile() : null;
        Title title3 = new Title("title", new Title.Attributes(title2 == null ? "" : title2, null, null, 6, null), styles2 != null ? styles2.getTitleStyleValue() : null);
        String str6 = btnLaunchMobile;
        Text text = new Text("body", new Text.Attributes(String.valueOf(descriptionMobile), null, null, 6, null), styles2 != null ? styles2.getTextStyleValue() : null);
        BasicButtonAttributes basicButtonAttributes = new BasicButtonAttributes(String.valueOf(str6), Button.ButtonType.PRIMARY, null, null, null, null, 60, null);
        if (styles2 == null || (buttonPrimaryStyleValue = styles2.getButtonPrimaryStyleValue()) == null) {
            title = title3;
            integrationStepStyle = styles;
            cancelDialog = cancelDialog2;
            buttonActionComponentStyle = null;
        } else {
            title = title3;
            integrationStepStyle = styles;
            cancelDialog = cancelDialog2;
            buttonActionComponentStyle = new ButtonActionComponentStyle(buttonPrimaryStyleValue.getPadding(), buttonPrimaryStyleValue.getMargin(), new AttributeStyles.ButtonBasedJustifyStyle(new StyleElements.Position(StyleElements.PositionType.END)), buttonPrimaryStyleValue.getFontFamily(), buttonPrimaryStyleValue.getFontSize(), buttonPrimaryStyleValue.getFontWeight(), buttonPrimaryStyleValue.getLetterSpacing(), buttonPrimaryStyleValue.getLineHeight(), buttonPrimaryStyleValue.getTextColor(), buttonPrimaryStyleValue.getHeight(), buttonPrimaryStyleValue.getWidth(), buttonPrimaryStyleValue.getBackgroundColor(), buttonPrimaryStyleValue.getBorderColor(), buttonPrimaryStyleValue.getBorderRadius(), buttonPrimaryStyleValue.getBorderWidth());
        }
        Footer.Attributes attributes = new Footer.Attributes(CollectionsKt__CollectionsJVMKt.listOf(new ActionButton("button_open_browser", basicButtonAttributes, buttonActionComponentStyle)), null, 2, null);
        AttributeStyles.FooterColorStyle footerColorStyle = new AttributeStyles.FooterColorStyle((styles2 == null || (backgroundColor = styles2.getBackgroundColor()) == null) ? null : backgroundColor.getBase());
        if (styles2 == null || (padding = styles2.getPadding()) == null || (modal = padding.getModal()) == null) {
            str4 = type2;
            sizeSet = null;
        } else {
            StyleElements.SizeSet base = modal.getBase();
            str4 = type2;
            sizeSet = base;
        }
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new UiComponentConfig[]{title, text, new Footer(Footer.f1485type, attributes, new Footer.FooterComponentStyle(footerColorStyle, new AttributeStyles.FooterPaddingStyle(new StyleElements.MeasurementSet(sizeSet)), null))});
        return new InquiryState.IntegrationStepRunning(str2, str, null, integrationStepStyle, cancelDialog, str4, flowUrl, redirectPath, integrationStepBrowserType2, localizations2, str5, name, booleanValue, booleanValue2, Boxes$$ExternalSyntheticOutline1.m(), new IntegrationPage(listOf, new StepStyles.UiStepStyle(styles2 != null ? styles2.getHeaderButtonColor() : null, styles2 != null ? styles2.getBackgroundColor() : null, styles2 != null ? styles2.getBackgroundImage() : null, styles2 != null ? styles2.getTitleStyle() : null, styles2 != null ? styles2.getTextStyle() : null, styles2 != null ? styles2.getButtonPrimaryStyle() : null, styles2 != null ? styles2.getButtonSecondaryStyle() : null, styles2 != null ? styles2.getStrokeColor() : null, styles2 != null ? styles2.getFillColor() : null, styles2 != null ? styles2.getAlignment() : null, styles2 != null ? styles2.getPadding() : null, styles2 != null ? styles2.getBorderRadius() : null), UiComponentKt.to(listOf), "button_open_browser"), null, inquirySessionConfig);
    }

    public static final InquiryState.UiStepRunning toInquiryState(NextStep.Ui ui, String str, String str2, String str3, Map map, InquirySessionConfig inquirySessionConfig, String str4) {
        Map map2;
        str.getClass();
        str2.getClass();
        inquirySessionConfig.getClass();
        String str5 = str3 == null ? "" : str3;
        String name = ui.getName();
        List<UiComponentConfig> components = ui.getConfig().getComponents();
        if (components == null) {
            components = EmptyList.INSTANCE;
        }
        List<UiComponentConfig> list = components;
        Boolean backStepEnabled = ui.getConfig().getBackStepEnabled();
        boolean booleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = ui.getConfig().getCancelButtonEnabled();
        boolean booleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        Boolean terminal = ui.getConfig().getTerminal();
        boolean booleanValue3 = terminal != null ? terminal.booleanValue() : false;
        String webviewUrl = ui.getConfig().getWebviewUrl();
        if (map != null) {
            map2 = toInquiryFieldSdkMap(map);
        } else {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        }
        Map map3 = map2;
        StepStyles.UiStepStyle styles = ui.getStyles();
        String m = Boxes$$ExternalSyntheticOutline1.m();
        NextStep.Ui.Localizations localizations = ui.getConfig().getLocalizations();
        return new InquiryState.UiStepRunning(str2, str, null, styles, localizations != null ? localizations.getCancelDialog() : null, ui.getConfig().getLocalizations(), str5, name, list, booleanValue, booleanValue2, booleanValue3, webviewUrl, map3, m, ui.getConfig().getServerComponentErrors(), null, inquirySessionConfig, false, str4);
    }

    public static final InquiryState.Complete toInquiryState(NextStep.Complete complete, String str, String str2, String str3, Map map, InquirySessionConfig inquirySessionConfig, String str4) {
        Map map2;
        str.getClass();
        str2.getClass();
        inquirySessionConfig.getClass();
        if (str3 == null) {
            str3 = "";
        }
        String str5 = str3;
        if (map != null) {
            map2 = toInquiryFieldSdkMap(map);
        } else {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        }
        return new InquiryState.Complete(str2, str, null, str5, map2, inquirySessionConfig, str4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config, still in use, count: 3, list:
          (r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config) from 0x00bc: MOVE (r18v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config) = (r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config)
          (r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config) from 0x00a1: MOVE (r18v4 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config) = (r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config)
          (r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config) from 0x009c: MOVE (r18v7 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config) = (r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final com.withpersona.sdk2.inquiry.internal.InquiryState toInquiryState(com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse r31, java.lang.String r32, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r33) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.ConversionsKt.toInquiryState(com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):com.withpersona.sdk2.inquiry.internal.InquiryState");
    }
}
