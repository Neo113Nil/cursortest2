package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalAppointment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalAppointment$AppointmentStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalAppointment.AppointmentStatus.Companion.getClass();
        switch (i) {
            case 0:
                return LocalAppointment.AppointmentStatus.APPOINTMENT_STATUS_UNSPECIFIED;
            case 1:
                return LocalAppointment.AppointmentStatus.APPOINTMENT_STATUS_PENDING;
            case 2:
                return LocalAppointment.AppointmentStatus.APPOINTMENT_STATUS_ACCEPTED;
            case 3:
                return LocalAppointment.AppointmentStatus.APPOINTMENT_STATUS_CANCELLED_BY_CUSTOMER;
            case 4:
                return LocalAppointment.AppointmentStatus.APPOINTMENT_STATUS_CANCELLED_BY_SELLER;
            case 5:
                return LocalAppointment.AppointmentStatus.APPOINTMENT_STATUS_DECLINED;
            case 6:
                return LocalAppointment.AppointmentStatus.APPOINTMENT_STATUS_NO_SHOW;
            default:
                return null;
        }
    }
}
