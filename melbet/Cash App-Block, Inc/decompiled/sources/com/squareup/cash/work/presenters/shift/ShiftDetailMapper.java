package com.squareup.cash.work.presenters.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.ClockInEssentialsState;
import com.squareup.cash.work.data.real.RealPersonNameFormatter;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.cash.work.presenters.shift.data.ScheduledShiftStatus;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.wire.roster.mds.Name;
import com.squareup.protos.wire.roster.mds.Names;
import com.squareup.protos.wire.roster.mds.Unit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class ShiftDetailMapper {
    public final ClockInStateResolver clockInStateResolver;
    public final RealPersonNameFormatter personNameFormatter;
    public final RealShiftTimeFormatter shiftTimeFormatter;
    public final AndroidStringManager stringManager;

    public ShiftDetailMapper(AndroidStringManager androidStringManager, RealShiftTimeFormatter realShiftTimeFormatter, RealPersonNameFormatter realPersonNameFormatter, ClockInStateResolver clockInStateResolver) {
        this.stringManager = androidStringManager;
        this.shiftTimeFormatter = realShiftTimeFormatter;
        this.personNameFormatter = realPersonNameFormatter;
        this.clockInStateResolver = clockInStateResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0065, code lost:
    
        if (r6.length() > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ShiftDetailViewModel.Loaded.Details buildDetails(ShiftSchedule.Version version, List list, List list2, String str) {
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        Object obj2;
        String str6 = null;
        if (version != null && (str5 = version.location_id) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Unit protoModel = ((Location) it.next()).getProtoModel();
                if (protoModel != null) {
                    arrayList.add(protoModel);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (Intrinsics.areEqual(((Unit) obj2).token, str5)) {
                    break;
                }
            }
            Unit unit = (Unit) obj2;
            if (unit != null) {
                str2 = unit.nickname;
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                }
                Names names = unit.name;
                if (names != null) {
                    Name name = names.primary;
                    if (name != null) {
                        str2 = name.value;
                        if (str2 != null) {
                        }
                    }
                }
            }
        }
        str2 = null;
        if (version != null && (str3 = version.job_id) != null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (Intrinsics.areEqual(((Job) obj).getToken(), str3)) {
                    break;
                }
            }
            Job job = (Job) obj;
            if (job != null && (str4 = (String) job.title$delegate.getValue()) != null && str4.length() > 0) {
                str6 = str4;
            }
        }
        return new ShiftDetailViewModel.Loaded.Details(str2, str6, str);
    }

    public final ShiftDetailViewModel.Loaded.Assignee buildAssignee(Person person, MerchantIdentifier merchantIdentifier) {
        String str;
        String str2;
        Map map;
        Person.Name name = (merchantIdentifier == null || (str2 = merchantIdentifier.entityId) == null || person == null || (map = person.personNamesPerMerchant) == null) ? null : (Person.Name) map.get(str2);
        if (name == null || (str = name.fullName) == null) {
            str = name != null ? name.firstName : null;
            String str3 = name != null ? name.lastName : null;
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
            if (str3 == null || StringsKt.isBlank(str3)) {
                str3 = null;
            }
            if (str == null && str3 == null) {
                str = null;
            } else if (str == null) {
                str = str3;
            } else if (str3 != null) {
                str = RealPersonNameFormatter.FAMILY_NAME_FIRST_LANGUAGES.contains(((Locale) this.personNameFormatter.localeManager.resolvedLocale.$$delegate_0.getValue()).getLanguage()) ? str3.concat(str) : Recorder$$ExternalSyntheticOutline2.m(str, " ", str3);
            }
            if (str == null) {
                return null;
            }
        }
        String str4 = name != null ? name.initials : null;
        if (str4 == null) {
            str4 = "";
        }
        return new ShiftDetailViewModel.Loaded.Assignee(str, this.stringManager.get(R.string.work_presenters_shift_detail_assigned_label), str4);
    }

    public final ShiftDetailClockInState resolveClockInButtonState(ClockInEssentialsState clockInEssentialsState, String str) {
        boolean z;
        ScheduledShiftStatus scheduledShiftStatus;
        ShiftSchedule shiftSchedule;
        String str2 = null;
        ClockInEssentials.ClockedOutEssentials clockedOutEssentials = clockInEssentialsState instanceof ClockInEssentials.ClockedOutEssentials ? (ClockInEssentials.ClockedOutEssentials) clockInEssentialsState : null;
        boolean z2 = false;
        if (clockedOutEssentials == null) {
            return new ShiftDetailClockInState(false, false);
        }
        if (clockedOutEssentials.clockInControls.canClockInFromTeamApp) {
            ClockInEssentials.NextShift nextShift = clockedOutEssentials.nextShift;
            if (nextShift != null && (shiftSchedule = nextShift.shift) != null) {
                str2 = shiftSchedule.id;
            }
            if (Intrinsics.areEqual(str, str2)) {
                z = true;
                scheduledShiftStatus = this.clockInStateResolver.getClockInEnabledResult(clockedOutEssentials).scheduledShiftStatus;
                if (scheduledShiftStatus != null && scheduledShiftStatus.getCanClockIn()) {
                    z2 = true;
                }
                return new ShiftDetailClockInState(z, z2);
            }
        }
        z = false;
        scheduledShiftStatus = this.clockInStateResolver.getClockInEnabledResult(clockedOutEssentials).scheduledShiftStatus;
        if (scheduledShiftStatus != null) {
            z2 = true;
        }
        return new ShiftDetailClockInState(z, z2);
    }
}
