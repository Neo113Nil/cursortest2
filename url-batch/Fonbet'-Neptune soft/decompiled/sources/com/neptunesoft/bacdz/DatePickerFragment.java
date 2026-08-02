package com.neptunesoft.bacdz;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public class DatePickerFragment extends DialogFragment {
    static int day;
    static int month;
    static int year;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), (DatePickerDialog.OnDateSetListener) getActivity(), year, month - 1, day);
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 31);
        calendar.set(2, 11);
        calendar.set(1, 2026);
        Calendar calendar2 = Calendar.getInstance();
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
        String str = String.valueOf(format.charAt(8)) + String.valueOf(format.charAt(9));
        String str2 = String.valueOf(format.charAt(5)) + String.valueOf(format.charAt(6));
        String str3 = String.valueOf(format.charAt(0)) + String.valueOf(format.charAt(1)) + String.valueOf(format.charAt(2)) + String.valueOf(format.charAt(3));
        calendar2.set(5, Integer.parseInt(str));
        calendar2.set(2, Integer.parseInt(str2) - 1);
        calendar2.set(1, Integer.parseInt(str3));
        calendar2.add(5, 1);
        datePickerDialog.getDatePicker().setMaxDate(calendar.getTimeInMillis());
        datePickerDialog.getDatePicker().setMinDate(calendar2.getTimeInMillis());
        return datePickerDialog;
    }
}
