package com.squareup.cash.wallet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public abstract class FidesmoDeprovisionBlockerFactory {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TagFormFactor.values().length];
            try {
                TagFormFactor tagFormFactor = TagFormFactor.WAND;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TagFormFactor tagFormFactor2 = TagFormFactor.WAND;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TagFormFactor tagFormFactor3 = TagFormFactor.WAND;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TagFormFactor tagFormFactor4 = TagFormFactor.WAND;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TagFormFactor tagFormFactor5 = TagFormFactor.WAND;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TagFormFactor tagFormFactor6 = TagFormFactor.WAND;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FidesmoProvisioningBlocker createDeprovisionBlocker(AndroidStringManager androidStringManager, CashAppTag cashAppTag) {
        String str;
        int i;
        if (cashAppTag != null && (str = cashAppTag.displayName) != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
        }
        str = androidStringManager.get(R.string.wallet_tag_default_name);
        str.getClass();
        ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "tagDisplayName", str);
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.wallet_fidesmo_deprovision_title)).format(m);
        format2.getClass();
        zzd zzdVar = Icons.Companion;
        Icon icon = new Icon("YxclJB");
        TagFormFactor tagFormFactor = cashAppTag != null ? cashAppTag.formFactor : null;
        switch (tagFormFactor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()]) {
            case -1:
            case 5:
            case 6:
                i = R.string.wallet_fidesmo_deprovision_instruction_1_star;
                break;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
            case 2:
                i = R.string.wallet_fidesmo_deprovision_instruction_1_heart;
                break;
            case 3:
            case 4:
                i = R.string.wallet_fidesmo_deprovision_instruction_1_mini_card;
                break;
        }
        FidesmoProvisioningBlocker.InstructionsUiConfig instructionsUiConfig = new FidesmoProvisioningBlocker.InstructionsUiConfig(format2, new ListUnordered(CollectionsKt__CollectionsKt.listOf((Object[]) new ListUnordered.ListItem[]{new ListUnordered.ListItem(icon, com.squareup.util.cash.StringsKt.localized(androidStringManager.get(i)), null, null, null, 28, null), new ListUnordered.ListItem(new Icon("Xjy6RJ"), com.squareup.util.cash.StringsKt.localized(androidStringManager.get(R.string.wallet_fidesmo_deprovision_instruction_2)), null, null, null, 28, null), new ListUnordered.ListItem(new Icon("StkLXb"), com.squareup.util.cash.StringsKt.localized(androidStringManager.get(R.string.wallet_fidesmo_deprovision_instruction_3)), null, null, null, 28, null)}), ListUnordered.Variant.SUBTLE, 4), androidStringManager.get(R.string.wallet_fidesmo_deprovision_button), null, new FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl("https://cash-f.squarecdn.com/static/activation-android-1-hero.jpg"), null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null);
        String format3 = new MessageFormat(resources.getString(R.string.wallet_fidesmo_deprovision_scanning_hero)).format(zzel$EnumUnboxingLocalUtility.m(1, "tagDisplayName", str));
        format3.getClass();
        return new FidesmoProvisioningBlocker(instructionsUiConfig, new FidesmoProvisioningBlocker.ScanningUiConfig(null, CollectionsKt__CollectionsJVMKt.listOf(format3), null, null, null, null, 61, null), null, null, null, null, ByteString.EMPTY);
    }
}
