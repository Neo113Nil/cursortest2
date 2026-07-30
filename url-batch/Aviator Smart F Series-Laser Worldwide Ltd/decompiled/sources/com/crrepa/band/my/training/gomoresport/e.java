package com.crrepa.band.my.training.gomoresport;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.x0;
import com.my.lib.data.ErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class e {
    public static String getAvgHr(List<PerformanceInsights> list) {
        int intValue;
        int i8 = 0;
        int i9 = 0;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getLactateHeartRate() != null && (intValue = performanceInsights.getLactateHeartRate().intValue()) > 0) {
                i8++;
                i9 += intValue;
            }
        }
        return String.valueOf(i8 != 0 ? i9 / i8 : 0);
    }

    public static String getAvgPace(List<PerformanceInsights> list) {
        int i8 = 0;
        float f8 = 0.0f;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getLactateSpeed() != null) {
                float floatValue = performanceInsights.getLactateSpeed().floatValue();
                if (floatValue > 0.0f) {
                    i8++;
                    f8 += floatValue;
                }
            }
        }
        return secondSpeedToPace(i8 != 0 ? f8 / i8 : 0.0f);
    }

    public static String getAvgTrainingLoad(List<PerformanceInsights> list) {
        int intValue;
        int i8 = 0;
        int i9 = 0;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getCurrentLoad() != null && (intValue = performanceInsights.getCurrentLoad().intValue()) > 0) {
                i8++;
                i9 += intValue;
            }
        }
        return String.valueOf(i8 != 0 ? i9 / i8 : 0);
    }

    public static String getAvgVo2Max(List<PerformanceInsights> list) {
        int i8 = 0;
        float f8 = 0.0f;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getMaxOxygenIntake() != null) {
                float floatValue = performanceInsights.getMaxOxygenIntake().floatValue();
                if (floatValue > 0.0f) {
                    i8++;
                    f8 += floatValue;
                }
            }
        }
        return n.format(i8 == 0 ? i.DOUBLE_EPSILON : f8 / i8, n.ONE_DECIMAL_PATTERN);
    }

    public static List<Float> getDataVauleList(int i8, int i9, Date date, List<PerformanceInsights> list) {
        float f8;
        int intValue;
        ArrayList arrayList = new ArrayList();
        if (i8 == 3) {
            return getMonthAvgValueOfYear(i9, date, list);
        }
        Date startDateOfWeek = i8 == 1 ? i3.a.getStartDateOfWeek(date) : i3.a.getStartDateOfMonth(date);
        int dayCountByTabType = getDayCountByTabType(i8, date);
        for (int i10 = 0; i10 < dayCountByTabType; i10++) {
            Date dateOfOffsetDay = m.getDateOfOffsetDay(startDateOfWeek, i10);
            Iterator<PerformanceInsights> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PerformanceInsights next = it.next();
                if (next != null && next.getUpdateDate() != null && i3.a.isSameDay(dateOfOffsetDay, next.getDate())) {
                    if (i9 == 0) {
                        f8 = next.getMaxOxygenIntake().floatValue();
                    } else {
                        if (i9 == 1) {
                            intValue = next.getLactateHeartRate().intValue();
                        } else if (i9 == 2) {
                            f8 = next.getLactateSpeed().floatValue();
                        } else if (i9 == 3) {
                            intValue = next.getCurrentLoad().intValue();
                        }
                        f8 = intValue;
                    }
                }
            }
            f8 = 0.0f;
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    public static List<Date> getDateList(int i8, Date date) {
        ArrayList arrayList = new ArrayList();
        int dayCountByTabType = getDayCountByTabType(i8, date);
        Date startDateOfMonth = i8 == 2 ? i3.a.getStartDateOfMonth(date) : i8 == 3 ? i3.a.getStartDateOfYear(date) : i3.a.getStartDateOfWeek(date);
        for (int i9 = 0; i9 < dayCountByTabType; i9++) {
            if (i8 == 3) {
                arrayList.add(m.getDateOfOffsetMonth(startDateOfMonth, i9));
            } else {
                arrayList.add(m.getDateOfOffsetDay(startDateOfMonth, i9));
            }
        }
        return arrayList;
    }

    public static int getDayCountByTabType(int i8, Date date) {
        return i8 == 2 ? i3.a.getDayNumOfMonth(date) : i8 == 3 ? 12 : 7;
    }

    public static String getHrUnit() {
        return "bpm";
    }

    public static String getMaxHr(List<PerformanceInsights> list) {
        int i8 = 0;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getLactateHeartRate() != null && performanceInsights.getLactateHeartRate().intValue() > i8) {
                i8 = performanceInsights.getLactateHeartRate().intValue();
            }
        }
        return String.valueOf(i8);
    }

    public static String getMaxPace(List<PerformanceInsights> list) {
        float f8 = 0.0f;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getLactateSpeed() != null && performanceInsights.getLactateSpeed().floatValue() > f8) {
                f8 = performanceInsights.getLactateSpeed().floatValue();
            }
        }
        return secondSpeedToPace(f8);
    }

    public static String getMaxTrainingLoad(List<PerformanceInsights> list) {
        int i8 = 0;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getCurrentLoad() != null && performanceInsights.getCurrentLoad().intValue() > i8) {
                i8 = performanceInsights.getCurrentLoad().intValue();
            }
        }
        return String.valueOf(i8);
    }

    public static String getMaxVo2Max(List<PerformanceInsights> list) {
        float f8 = 0.0f;
        for (PerformanceInsights performanceInsights : list) {
            if (performanceInsights.getMaxOxygenIntake() != null && performanceInsights.getMaxOxygenIntake().floatValue() > f8) {
                f8 = performanceInsights.getMaxOxygenIntake().floatValue();
            }
        }
        return n.format(f8, n.ONE_DECIMAL_PATTERN);
    }

    private static List<Float> getMonthAvgValueOfYear(int i8, Date date, List<PerformanceInsights> list) {
        float intValue;
        if (x0.isEmpty(list)) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Date startDateOfYear = i3.a.getStartDateOfYear(date);
        for (int i9 = 0; i9 < 12; i9++) {
            Date dateOfOffsetMonth = m.getDateOfOffsetMonth(startDateOfYear, i9);
            float f8 = 0.0f;
            int i10 = 0;
            float f9 = 0.0f;
            for (PerformanceInsights performanceInsights : list) {
                if (i3.a.isSameMonth(performanceInsights.getDate(), dateOfOffsetMonth)) {
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 == 3 && performanceInsights.getCurrentLoad() != null) {
                                    intValue = performanceInsights.getCurrentLoad().intValue();
                                    if (intValue > 0.0f) {
                                        i10++;
                                        f9 += intValue;
                                    }
                                }
                            } else if (performanceInsights.getLactateSpeed() != null) {
                                intValue = performanceInsights.getLactateSpeed().floatValue();
                                if (intValue > 0.0f) {
                                    i10++;
                                    f9 += intValue;
                                }
                            }
                        } else if (performanceInsights.getLactateHeartRate() != null) {
                            intValue = performanceInsights.getLactateHeartRate().intValue();
                            if (intValue > 0.0f) {
                                i10++;
                                f9 += intValue;
                            }
                        }
                    } else if (performanceInsights.getMaxOxygenIntake() != null) {
                        intValue = performanceInsights.getMaxOxygenIntake().floatValue();
                        if (intValue > 0.0f) {
                            i10++;
                            f9 += intValue;
                        }
                    }
                }
            }
            if (i10 != 0) {
                f8 = f9 / i10;
            }
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    public static String getTrainingStatus(Integer num) {
        int i8 = R.string.training_status_none;
        if (num != null) {
            if (num.intValue() == 1) {
                i8 = R.string.training_status_overreaching;
            } else if (num.intValue() == 2) {
                i8 = R.string.training_status_detraining;
            } else if (num.intValue() == 3) {
                i8 = R.string.training_status_unproductive;
            } else if (num.intValue() == 4) {
                i8 = R.string.training_status_maintaining;
            } else if (num.intValue() == 5) {
                i8 = R.string.training_status_recovery;
            } else if (num.intValue() == 6) {
                i8 = R.string.training_status_productive;
            } else if (num.intValue() == 7) {
                i8 = R.string.training_status_peaking;
            }
        }
        return com.moyoung.dafit.module.common.utils.d.get().getString(i8);
    }

    public static String getVo2MaxUnit() {
        return "ml/kg/min";
    }

    public static List<String> getXAxisTextList(int i8, Date date) {
        String[] stringArray;
        if (i8 == 2) {
            int dateMonth = i3.a.getDateMonth(date) + 1;
            int dayNumOfMonth = i3.a.getDayNumOfMonth(date);
            stringArray = new String[dayNumOfMonth];
            int[] iArr = {1, 10, 20, dayNumOfMonth};
            for (int i9 = 0; i9 < dayNumOfMonth; i9++) {
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = iArr[i10];
                    if (i9 == i11 - 1) {
                        stringArray[i9] = dateMonth + "-" + i11;
                    }
                }
                if (TextUtils.isEmpty(stringArray[i9])) {
                    stringArray[i9] = "";
                }
            }
        } else {
            stringArray = i8 == 3 ? new String[]{"1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", ErrorCode.PARAMETER_ERROR, "6", "7", "8", "9", "10", "11", "12"} : com.moyoung.dafit.module.common.utils.d.get().getResources().getStringArray(R.array.weight_week_array);
        }
        return Arrays.asList(stringArray);
    }

    public static String secondSpeedToPace(float f8) {
        return String.format(Locale.getDefault(), "%d'%02d\"", Integer.valueOf((int) (f8 / 60.0f)), Integer.valueOf((int) (f8 % 60.0f)));
    }
}
