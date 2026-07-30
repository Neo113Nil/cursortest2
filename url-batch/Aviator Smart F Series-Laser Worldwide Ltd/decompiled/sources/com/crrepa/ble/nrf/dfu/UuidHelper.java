package com.crrepa.ble.nrf.dfu;

import android.content.Intent;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.UUID;

/* loaded from: classes3.dex */
class UuidHelper {
    UuidHelper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void assignCustomUuids(Intent intent) {
        UUID uuid;
        Parcelable[] parcelableArrayExtra;
        UUID uuid2;
        Parcelable[] parcelableArrayExtra2;
        UUID uuid3;
        Parcelable[] parcelableArrayExtra3;
        UUID uuid4;
        Parcelable[] parcelableArrayExtra4 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU);
        if (parcelableArrayExtra4 == null || parcelableArrayExtra4.length != 4) {
            UUID uuid5 = LegacyDfuImpl.DEFAULT_DFU_SERVICE_UUID;
            LegacyDfuImpl.DFU_SERVICE_UUID = uuid5;
            UUID uuid6 = LegacyDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
            LegacyDfuImpl.DFU_CONTROL_POINT_UUID = uuid6;
            LegacyDfuImpl.DFU_PACKET_UUID = LegacyDfuImpl.DEFAULT_DFU_PACKET_UUID;
            UUID uuid7 = LegacyDfuImpl.DEFAULT_DFU_VERSION_UUID;
            LegacyDfuImpl.DFU_VERSION_UUID = uuid7;
            LegacyButtonlessDfuImpl.DFU_SERVICE_UUID = uuid5;
            LegacyButtonlessDfuImpl.DFU_CONTROL_POINT_UUID = uuid6;
            LegacyButtonlessDfuImpl.DFU_VERSION_UUID = uuid7;
        } else {
            Parcelable parcelable = parcelableArrayExtra4[0];
            LegacyDfuImpl.DFU_SERVICE_UUID = parcelable != null ? ((ParcelUuid) parcelable).getUuid() : LegacyDfuImpl.DEFAULT_DFU_SERVICE_UUID;
            Parcelable parcelable2 = parcelableArrayExtra4[1];
            LegacyDfuImpl.DFU_CONTROL_POINT_UUID = parcelable2 != null ? ((ParcelUuid) parcelable2).getUuid() : LegacyDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
            Parcelable parcelable3 = parcelableArrayExtra4[2];
            LegacyDfuImpl.DFU_PACKET_UUID = parcelable3 != null ? ((ParcelUuid) parcelable3).getUuid() : LegacyDfuImpl.DEFAULT_DFU_PACKET_UUID;
            Parcelable parcelable4 = parcelableArrayExtra4[3];
            LegacyDfuImpl.DFU_VERSION_UUID = parcelable4 != null ? ((ParcelUuid) parcelable4).getUuid() : LegacyDfuImpl.DEFAULT_DFU_VERSION_UUID;
            LegacyButtonlessDfuImpl.DFU_SERVICE_UUID = LegacyDfuImpl.DFU_SERVICE_UUID;
            LegacyButtonlessDfuImpl.DFU_CONTROL_POINT_UUID = LegacyDfuImpl.DFU_CONTROL_POINT_UUID;
            LegacyButtonlessDfuImpl.DFU_VERSION_UUID = LegacyDfuImpl.DFU_VERSION_UUID;
        }
        Parcelable[] parcelableArrayExtra5 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU);
        if (parcelableArrayExtra5 == null || parcelableArrayExtra5.length != 3) {
            SecureDfuImpl.DFU_SERVICE_UUID = SecureDfuImpl.DEFAULT_DFU_SERVICE_UUID;
            SecureDfuImpl.DFU_CONTROL_POINT_UUID = SecureDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
        } else {
            Parcelable parcelable5 = parcelableArrayExtra5[0];
            SecureDfuImpl.DFU_SERVICE_UUID = parcelable5 != null ? ((ParcelUuid) parcelable5).getUuid() : SecureDfuImpl.DEFAULT_DFU_SERVICE_UUID;
            Parcelable parcelable6 = parcelableArrayExtra5[1];
            SecureDfuImpl.DFU_CONTROL_POINT_UUID = parcelable6 != null ? ((ParcelUuid) parcelable6).getUuid() : SecureDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
            Parcelable parcelable7 = parcelableArrayExtra5[2];
            if (parcelable7 != null) {
                uuid = ((ParcelUuid) parcelable7).getUuid();
                SecureDfuImpl.DFU_PACKET_UUID = uuid;
                parcelableArrayExtra = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU);
                if (parcelableArrayExtra == null && parcelableArrayExtra.length == 2) {
                    Parcelable parcelable8 = parcelableArrayExtra[0];
                    ExperimentalButtonlessDfuImpl.EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID = parcelable8 != null ? ((ParcelUuid) parcelable8).getUuid() : ExperimentalButtonlessDfuImpl.DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID;
                    Parcelable parcelable9 = parcelableArrayExtra[1];
                    if (parcelable9 != null) {
                        uuid2 = ((ParcelUuid) parcelable9).getUuid();
                        ExperimentalButtonlessDfuImpl.EXPERIMENTAL_BUTTONLESS_DFU_UUID = uuid2;
                        parcelableArrayExtra2 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING);
                        if (parcelableArrayExtra2 == null && parcelableArrayExtra2.length == 2) {
                            Parcelable parcelable10 = parcelableArrayExtra2[0];
                            ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = parcelable10 != null ? ((ParcelUuid) parcelable10).getUuid() : ButtonlessDfuWithoutBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
                            Parcelable parcelable11 = parcelableArrayExtra2[1];
                            if (parcelable11 != null) {
                                uuid3 = ((ParcelUuid) parcelable11).getUuid();
                                ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_UUID = uuid3;
                                parcelableArrayExtra3 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING);
                                if (parcelableArrayExtra3 == null && parcelableArrayExtra3.length == 2) {
                                    Parcelable parcelable12 = parcelableArrayExtra3[0];
                                    ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = parcelable12 != null ? ((ParcelUuid) parcelable12).getUuid() : ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
                                    Parcelable parcelable13 = parcelableArrayExtra3[1];
                                    if (parcelable13 != null) {
                                        uuid4 = ((ParcelUuid) parcelable13).getUuid();
                                        ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_UUID = uuid4;
                                    }
                                } else {
                                    ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
                                }
                                uuid4 = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_UUID;
                                ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_UUID = uuid4;
                            }
                        } else {
                            ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = ButtonlessDfuWithoutBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
                        }
                        uuid3 = ButtonlessDfuWithoutBondSharingImpl.DEFAULT_BUTTONLESS_DFU_UUID;
                        ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_UUID = uuid3;
                        parcelableArrayExtra3 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING);
                        if (parcelableArrayExtra3 == null) {
                        }
                        ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
                        uuid4 = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_UUID;
                        ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_UUID = uuid4;
                    }
                } else {
                    ExperimentalButtonlessDfuImpl.EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID = ExperimentalButtonlessDfuImpl.DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID;
                }
                uuid2 = ExperimentalButtonlessDfuImpl.DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_UUID;
                ExperimentalButtonlessDfuImpl.EXPERIMENTAL_BUTTONLESS_DFU_UUID = uuid2;
                parcelableArrayExtra2 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING);
                if (parcelableArrayExtra2 == null) {
                }
                ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = ButtonlessDfuWithoutBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
                uuid3 = ButtonlessDfuWithoutBondSharingImpl.DEFAULT_BUTTONLESS_DFU_UUID;
                ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_UUID = uuid3;
                parcelableArrayExtra3 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING);
                if (parcelableArrayExtra3 == null) {
                }
                ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
                uuid4 = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_UUID;
                ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_UUID = uuid4;
            }
        }
        uuid = SecureDfuImpl.DEFAULT_DFU_PACKET_UUID;
        SecureDfuImpl.DFU_PACKET_UUID = uuid;
        parcelableArrayExtra = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU);
        if (parcelableArrayExtra == null) {
        }
        ExperimentalButtonlessDfuImpl.EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID = ExperimentalButtonlessDfuImpl.DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID;
        uuid2 = ExperimentalButtonlessDfuImpl.DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_UUID;
        ExperimentalButtonlessDfuImpl.EXPERIMENTAL_BUTTONLESS_DFU_UUID = uuid2;
        parcelableArrayExtra2 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING);
        if (parcelableArrayExtra2 == null) {
        }
        ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = ButtonlessDfuWithoutBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
        uuid3 = ButtonlessDfuWithoutBondSharingImpl.DEFAULT_BUTTONLESS_DFU_UUID;
        ButtonlessDfuWithoutBondSharingImpl.BUTTONLESS_DFU_UUID = uuid3;
        parcelableArrayExtra3 = intent.getParcelableArrayExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING);
        if (parcelableArrayExtra3 == null) {
        }
        ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_SERVICE_UUID = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
        uuid4 = ButtonlessDfuWithBondSharingImpl.DEFAULT_BUTTONLESS_DFU_UUID;
        ButtonlessDfuWithBondSharingImpl.BUTTONLESS_DFU_UUID = uuid4;
    }
}
