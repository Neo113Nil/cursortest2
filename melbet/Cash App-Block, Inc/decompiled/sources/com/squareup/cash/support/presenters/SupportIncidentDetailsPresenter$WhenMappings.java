package com.squareup.cash.support.presenters;

import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$SubscriptionAction;
import com.squareup.cash.support.screens.SupportScreens;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class SupportIncidentDetailsPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[IncidentViewModel$SubscriptionAction.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction = IncidentViewModel$SubscriptionAction.SUBSCRIBE;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Incident.Status.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            Incident.Status status = Incident.Status.IDENTIFIED;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            Incident.Status status2 = Incident.Status.IDENTIFIED;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            Incident.Status status3 = Incident.Status.IDENTIFIED;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source source = SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.HOME;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source source2 = SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.HOME;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source source3 = SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.HOME;
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
