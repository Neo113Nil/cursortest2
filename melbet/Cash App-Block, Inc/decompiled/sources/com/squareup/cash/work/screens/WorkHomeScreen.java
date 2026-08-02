package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.work.screens.ClockInBottomSheetScreen;
import com.squareup.cash.work.screens.TakeBreakBottomSheetScreen;
import java.time.OffsetDateTime;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class WorkHomeScreen implements Screen {
    public static final WorkHomeScreen INSTANCE = new WorkHomeScreen();
    public static final Parcelable.Creator<WorkHomeScreen> CREATOR = new Creator(0);

    /* loaded from: classes7.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    parcel.readInt();
                    return WorkHomeScreen.INSTANCE;
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return CardControlDialogViewModel.Button.Response.Dismiss.INSTANCE;
                case 2:
                    parcel.getClass();
                    return new CardControlDialogViewModel.Button.Response.OpenUrl(parcel.readString());
                case 3:
                    parcel.getClass();
                    return new PresentationAction(parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    PresentationTimelineViewModel.Icon valueOf = PresentationTimelineViewModel.Icon.valueOf(parcel.readString());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(PresentationTimelineViewModel.Step.CREATOR, parcel, arrayList, i2, 1);
                    }
                    return new PresentationTimelineViewModel(valueOf, readString, readString2, arrayList, parcel.readInt() != 0 ? PresentationAction.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new PresentationTimelineViewModel.Step(parcel.readString(), parcel.readString(), PresentationTimelineViewModel.Step.State.valueOf(parcel.readString()));
                case 6:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(ClockInBottomSheetScreen.JobInfo.CREATOR, parcel, arrayList2, i3, 1);
                    }
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i4 = 0;
                    while (i4 != readInt3) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(ClockInBottomSheetScreen.LocationInfo.CREATOR, parcel, arrayList3, i4, 1);
                    }
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    boolean z4 = parcel.readInt() != 0;
                    boolean z5 = parcel.readInt() != 0;
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    int i5 = 0;
                    while (i5 != readInt4) {
                        i5 = CameraState$Type$EnumUnboxingLocalUtility.m(LocationClockInControls.CREATOR, parcel, arrayList4, i5, 1);
                        readInt4 = readInt4;
                        arrayList2 = arrayList2;
                    }
                    ArrayList arrayList5 = arrayList2;
                    boolean z6 = parcel.readInt() != 0;
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt5);
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList7 = arrayList4;
                        if (i6 == readInt5) {
                            return new ClockInBottomSheetScreen(readString3, readString4, readString5, arrayList5, arrayList3, readString6, readString7, readString8, readString9, readString10, readString11, z4, z5, arrayList7, z6, arrayList6, (AskedQuestion) parcel.readParcelable(ClockInBottomSheetScreen.class.getClassLoader()));
                        }
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(ClockInBottomSheetScreen.LocationCoordinates.CREATOR, parcel, arrayList6, i6, 1);
                        arrayList4 = arrayList7;
                        readInt5 = readInt5;
                    }
                case 7:
                    parcel.getClass();
                    return new ClockInBottomSheetScreen.JobInfo(parcel.readString(), parcel.readString());
                case 8:
                    parcel.getClass();
                    return new ClockInBottomSheetScreen.LocationCoordinates(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
                case 9:
                    parcel.getClass();
                    return new ClockInBottomSheetScreen.LocationInfo(parcel.readString(), parcel.readString());
                case 10:
                    parcel.getClass();
                    return new ClockInOverlayScreen(parcel.readInt() != 0);
                case 11:
                    parcel.getClass();
                    parcel.readInt();
                    return ClockInResult$Cancelled.INSTANCE;
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return ClockInResult$Success.INSTANCE;
                case 13:
                    parcel.getClass();
                    return new DeclareCashTipBottomSheetScreen(parcel.readString(), parcel.readString(), parcel.readString(), (AskedQuestion) parcel.readParcelable(DeclareCashTipBottomSheetScreen.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return DeclareCashTipResult$Cancelled.INSTANCE;
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return DeclareCashTipResult$Success.INSTANCE;
                case 16:
                    parcel.getClass();
                    String readString12 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                        z2 = false;
                    } else {
                        z = true;
                        z3 = false;
                        z2 = false;
                    }
                    String readString13 = parcel.readString();
                    boolean z7 = z;
                    String readString14 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z2 = z7;
                    }
                    return new LocationClockInControls(readString12, z3, readString13, readString14, z2, parcel.readDouble());
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return MerchantPickerBottomSheetScreen.INSTANCE;
                case 18:
                    parcel.getClass();
                    return new ShiftDetailScreen(parcel.readString());
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return ShiftListScreen.INSTANCE;
                case 20:
                    parcel.getClass();
                    return new ShiftNotStartedDialogScreen((OffsetDateTime) parcel.readSerializable(), parcel.readString());
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return ShiftNoteResult$Cancelled.INSTANCE;
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return ShiftNoteResult$Deleted.INSTANCE;
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return ShiftNoteResult$Saved.INSTANCE;
                case 24:
                    parcel.getClass();
                    return new ShiftNoteScreen(parcel.readString(), parcel.readString(), parcel.readString(), (OffsetDateTime) parcel.readSerializable(), (AskedQuestion) parcel.readParcelable(ShiftNoteScreen.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new TakeBreakBottomSheetScreen.BreakInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
                case 26:
                    parcel.getClass();
                    String readString15 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt6);
                    while (i != readInt6) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(TakeBreakBottomSheetScreen.BreakInfo.CREATOR, parcel, arrayList8, i, 1);
                    }
                    return new TakeBreakBottomSheetScreen(readString15, arrayList8, (AskedQuestion) parcel.readParcelable(TakeBreakBottomSheetScreen.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return TakeBreakResult$Cancelled.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return TakeBreakResult$Success.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return TimecardDetailScreen.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new WorkHomeScreen[i];
                case 1:
                    return new CardControlDialogViewModel.Button.Response.Dismiss[i];
                case 2:
                    return new CardControlDialogViewModel.Button.Response.OpenUrl[i];
                case 3:
                    return new PresentationAction[i];
                case 4:
                    return new PresentationTimelineViewModel[i];
                case 5:
                    return new PresentationTimelineViewModel.Step[i];
                case 6:
                    return new ClockInBottomSheetScreen[i];
                case 7:
                    return new ClockInBottomSheetScreen.JobInfo[i];
                case 8:
                    return new ClockInBottomSheetScreen.LocationCoordinates[i];
                case 9:
                    return new ClockInBottomSheetScreen.LocationInfo[i];
                case 10:
                    return new ClockInOverlayScreen[i];
                case 11:
                    return new ClockInResult$Cancelled[i];
                case 12:
                    return new ClockInResult$Success[i];
                case 13:
                    return new DeclareCashTipBottomSheetScreen[i];
                case 14:
                    return new DeclareCashTipResult$Cancelled[i];
                case 15:
                    return new DeclareCashTipResult$Success[i];
                case 16:
                    return new LocationClockInControls[i];
                case 17:
                    return new MerchantPickerBottomSheetScreen[i];
                case 18:
                    return new ShiftDetailScreen[i];
                case 19:
                    return new ShiftListScreen[i];
                case 20:
                    return new ShiftNotStartedDialogScreen[i];
                case 21:
                    return new ShiftNoteResult$Cancelled[i];
                case 22:
                    return new ShiftNoteResult$Deleted[i];
                case 23:
                    return new ShiftNoteResult$Saved[i];
                case 24:
                    return new ShiftNoteScreen[i];
                case 25:
                    return new TakeBreakBottomSheetScreen.BreakInfo[i];
                case 26:
                    return new TakeBreakBottomSheetScreen[i];
                case 27:
                    return new TakeBreakResult$Cancelled[i];
                case 28:
                    return new TakeBreakResult$Success[i];
                default:
                    return new TimecardDetailScreen[i];
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WorkHomeScreen);
    }

    public final int hashCode() {
        return 1303341390;
    }

    public final String toString() {
        return "WorkHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
