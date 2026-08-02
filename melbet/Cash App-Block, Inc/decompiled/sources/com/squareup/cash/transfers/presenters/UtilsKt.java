package com.squareup.cash.transfers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavControllerViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.out.sync_entity.BankAccountQualifier;
import com.squareup.cash.out.sync_entity.DebitCardQualifier;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.backend.api.CashOutCapabilityManager$CashOutCapabilities;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes7.dex */
public abstract class UtilsKt {

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BankAccountQualifier.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DebitCardQualifier.values().length];
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Op.Companion companion = DebitCardQualifier.Companion;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Op.Companion companion2 = DebitCardQualifier.Companion;
                iArr3[0] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final String cardInfoLabel(Instrument instrument, AndroidStringManager androidStringManager) {
        Resources resources = androidStringManager.resources;
        instrument.getClass();
        String str = instrument.suffix;
        if (str == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[instrument.cashInstrumentType.ordinal()];
        if (i == 1) {
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.instrument_details_card_type_debit)).format(new Object[]{str});
            format2.getClass();
            return format2;
        }
        if (i != 2) {
            return null;
        }
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.instrument_details_card_type_credit)).format(new Object[]{str});
        format3.getClass();
        return format3;
    }

    public static final CashOutCapabilityManager$CashOutCapabilities.QualifiedCapability findQualifiedCapability(CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability instrumentCapability, Instrument instrument) {
        instrument.getClass();
        Object obj = null;
        if (instrument.cashInstrumentType != instrumentCapability.instrumentType) {
            instrumentCapability = null;
        }
        if (instrumentCapability == null) {
            return null;
        }
        Iterator it = instrumentCapability.qualifiedCapability.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (isMatch(((CashOutCapabilityManager$CashOutCapabilities.QualifiedCapability) next).instrumentQualifier, instrument)) {
                obj = next;
                break;
            }
        }
        return (CashOutCapabilityManager$CashOutCapabilities.QualifiedCapability) obj;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBalanceAddCash.deepLinkSpecs;
    }

    public static NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
        viewModelStore.getClass();
        InitializerViewModelFactory initializerViewModelFactory = NavControllerViewModelKt.FACTORY;
        CreationExtras.Empty empty = CreationExtras.Empty.INSTANCE;
        initializerViewModelFactory.getClass();
        empty.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, initializerViewModelFactory, empty);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NavControllerViewModel.class);
        String canonicalName = SizeKt.getCanonicalName(orCreateKotlinClass);
        if (canonicalName != null) {
            return (NavControllerViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), orCreateKotlinClass);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final boolean isMatch(CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier instrumentQualifier, Instrument instrument) {
        if (instrumentQualifier instanceof CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.BankAccount) {
            if (WhenMappings.$EnumSwitchMapping$1[((CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.BankAccount) instrumentQualifier).bankAccountQualifier.ordinal()] == 1) {
                return true;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
        if (!(instrumentQualifier instanceof CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.Debit)) {
            return false;
        }
        int ordinal = ((CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.Debit) instrumentQualifier).debitCardQualifier.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return instrument.cardBrand == InstrumentType.VISA;
        }
        if (ordinal == 2) {
            return instrument.defaultForInstrumentType;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }
}
