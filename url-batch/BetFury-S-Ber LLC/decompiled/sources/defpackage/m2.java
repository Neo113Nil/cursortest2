package defpackage;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import com.trembin.nirefon.betfury.R;
import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.data.Priority;
import com.trembin.nirefon.betfury.databinding.BottomSheetNoteBinding;
import com.trembin.nirefon.betfury.receiver.AlarmReceiver;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class m2 extends m9 {
    public BottomSheetNoteBinding o0;
    public final wg0 p0 = new wg0(new h2(0, this));
    public Note q0;
    public Long r0;
    public boolean s0;

    @Override // androidx.fragment.app.a
    public final void A(View view) {
        int i;
        view.getClass();
        Dialog dialog = this.j0;
        l9 l9Var = dialog instanceof l9 ? (l9) dialog : null;
        final int i2 = 1;
        final int i3 = 3;
        if (l9Var != null) {
            if (l9Var.l == null) {
                l9Var.h();
            }
            BottomSheetBehavior bottomSheetBehavior = l9Var.l;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.L(3);
                bottomSheetBehavior.K = true;
            }
        }
        Bundle bundle = this.k;
        final int i4 = 2;
        final int i5 = 0;
        if (bundle != null) {
            int i6 = bundle.getInt("arg_id", 0);
            BottomSheetNoteBinding bottomSheetNoteBinding = this.o0;
            if (i6 == 0) {
                bottomSheetNoteBinding.getClass();
                bottomSheetNoteBinding.tvSheetTitle.setText(R.string.new_note);
                BottomSheetNoteBinding bottomSheetNoteBinding2 = this.o0;
                bottomSheetNoteBinding2.getClass();
                bottomSheetNoteBinding2.btnDelete.setVisibility(8);
            } else {
                bottomSheetNoteBinding.getClass();
                bottomSheetNoteBinding.tvSheetTitle.setText(R.string.edit_note);
                BottomSheetNoteBinding bottomSheetNoteBinding3 = this.o0;
                bottomSheetNoteBinding3.getClass();
                bottomSheetNoteBinding3.btnDelete.setVisibility(0);
                String string = bundle.getString("arg_title", "");
                string.getClass();
                String string2 = bundle.getString("arg_content", "");
                string2.getClass();
                String string3 = bundle.getString("arg_priority", "LOW");
                string3.getClass();
                Note note = new Note(i6, string, string2, Priority.valueOf(string3), bundle.getBoolean("arg_pinned", false), bundle.containsKey("arg_reminder") ? Long.valueOf(bundle.getLong("arg_reminder")) : null, 0L, 0L, 192, null);
                this.q0 = note;
                BottomSheetNoteBinding bottomSheetNoteBinding4 = this.o0;
                bottomSheetNoteBinding4.getClass();
                bottomSheetNoteBinding4.etTitle.setText(note.getTitle());
                BottomSheetNoteBinding bottomSheetNoteBinding5 = this.o0;
                bottomSheetNoteBinding5.getClass();
                bottomSheetNoteBinding5.etContent.setText(note.getContent());
                this.s0 = note.isPinned();
                this.r0 = note.getReminderTime();
                int i7 = l2.a[note.getPriority().ordinal()];
                if (i7 == 1) {
                    i = R.id.chipLow;
                } else if (i7 == 2) {
                    i = R.id.chipMedium;
                } else if (i7 == 3) {
                    i = R.id.chipHigh;
                } else {
                    if (i7 != 4) {
                        throw new md();
                    }
                    i = R.id.chipUrgent;
                }
                BottomSheetNoteBinding bottomSheetNoteBinding6 = this.o0;
                bottomSheetNoteBinding6.getClass();
                gb gbVar = bottomSheetNoteBinding6.chipGroupPriority.m;
                Chip chip = (Chip) gbVar.a.get(Integer.valueOf(i));
                if (chip != null && gbVar.a(chip)) {
                    gbVar.d();
                }
                BottomSheetNoteBinding bottomSheetNoteBinding7 = this.o0;
                bottomSheetNoteBinding7.getClass();
                bottomSheetNoteBinding7.btnPin.setText(k(this.s0 ? R.string.unpin : R.string.pin));
                L();
            }
        }
        BottomSheetNoteBinding bottomSheetNoteBinding8 = this.o0;
        bottomSheetNoteBinding8.getClass();
        bottomSheetNoteBinding8.btnSave.setOnClickListener(new View.OnClickListener(this) { // from class: g2
            public final /* synthetic */ m2 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String obj;
                String obj2;
                int i8 = i5;
                int i9 = 0;
                final m2 m2Var = this.g;
                switch (i8) {
                    case 0:
                        wg0 wg0Var = m2Var.p0;
                        BottomSheetNoteBinding bottomSheetNoteBinding9 = m2Var.o0;
                        bottomSheetNoteBinding9.getClass();
                        Editable text = bottomSheetNoteBinding9.etTitle.getText();
                        String str = null;
                        String obj3 = (text == null || (obj2 = text.toString()) == null) ? null : mf0.E(obj2).toString();
                        String str2 = obj3 == null ? "" : obj3;
                        int length = str2.length();
                        BottomSheetNoteBinding bottomSheetNoteBinding10 = m2Var.o0;
                        if (length != 0) {
                            bottomSheetNoteBinding10.getClass();
                            bottomSheetNoteBinding10.tilTitle.setError(null);
                            BottomSheetNoteBinding bottomSheetNoteBinding11 = m2Var.o0;
                            bottomSheetNoteBinding11.getClass();
                            Editable text2 = bottomSheetNoteBinding11.etContent.getText();
                            if (text2 != null && (obj = text2.toString()) != null) {
                                str = mf0.E(obj).toString();
                            }
                            String str3 = str == null ? "" : str;
                            BottomSheetNoteBinding bottomSheetNoteBinding12 = m2Var.o0;
                            bottomSheetNoteBinding12.getClass();
                            int checkedChipId = bottomSheetNoteBinding12.chipGroupPriority.getCheckedChipId();
                            Priority priority = checkedChipId == R.id.chipMedium ? Priority.MEDIUM : checkedChipId == R.id.chipHigh ? Priority.HIGH : checkedChipId == R.id.chipUrgent ? Priority.URGENT : Priority.LOW;
                            Context applicationContext = m2Var.E().getApplicationContext();
                            Note note2 = m2Var.q0;
                            boolean z = m2Var.s0;
                            Long l = m2Var.r0;
                            if (note2 == null) {
                                Note note3 = new Note(0, str2, str3, priority, z, l, 0L, 0L, 193, null);
                                ((NotesViewModel) wg0Var.getValue()).insert(note3, new j2(m2Var, applicationContext, note3, i9));
                            } else {
                                Note copy$default = Note.copy$default(note2, 0, str2, str3, priority, z, l, 0L, System.currentTimeMillis(), 65, null);
                                ((NotesViewModel) wg0Var.getValue()).update(copy$default);
                                applicationContext.getClass();
                                PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, note2.getId(), new Intent(applicationContext, (Class<?>) AlarmReceiver.class), 603979776);
                                if (broadcast != null) {
                                    ((AlarmManager) applicationContext.getSystemService(AlarmManager.class)).cancel(broadcast);
                                    broadcast.cancel();
                                }
                                if (m2Var.r0 != null) {
                                    gk0.M(applicationContext, copy$default);
                                }
                            }
                            Dialog dialog2 = m2Var.j0;
                            if (dialog2 instanceof l9) {
                                l9 l9Var2 = (l9) dialog2;
                                if (l9Var2.l == null) {
                                    l9Var2.h();
                                }
                                boolean z2 = l9Var2.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        } else {
                            bottomSheetNoteBinding10.getClass();
                            bottomSheetNoteBinding10.tilTitle.setError(m2Var.k(R.string.title_required));
                            break;
                        }
                        break;
                    case 1:
                        Note note4 = m2Var.q0;
                        if (note4 != null) {
                            ((NotesViewModel) m2Var.p0.getValue()).delete(note4);
                            Context applicationContext2 = m2Var.E().getApplicationContext();
                            applicationContext2.getClass();
                            PendingIntent broadcast2 = PendingIntent.getBroadcast(applicationContext2, note4.getId(), new Intent(applicationContext2, (Class<?>) AlarmReceiver.class), 603979776);
                            if (broadcast2 != null) {
                                ((AlarmManager) applicationContext2.getSystemService(AlarmManager.class)).cancel(broadcast2);
                                broadcast2.cancel();
                            }
                            Dialog dialog3 = m2Var.j0;
                            if (dialog3 instanceof l9) {
                                l9 l9Var3 = (l9) dialog3;
                                if (l9Var3.l == null) {
                                    l9Var3.h();
                                }
                                boolean z3 = l9Var3.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        }
                        break;
                    case 2:
                        m2Var.s0 = !m2Var.s0;
                        BottomSheetNoteBinding bottomSheetNoteBinding13 = m2Var.o0;
                        bottomSheetNoteBinding13.getClass();
                        bottomSheetNoteBinding13.btnPin.setText(m2Var.k(m2Var.s0 ? R.string.unpin : R.string.pin));
                        break;
                    default:
                        final Calendar calendar = Calendar.getInstance();
                        Long l2 = m2Var.r0;
                        if (l2 != null) {
                            calendar.setTimeInMillis(l2.longValue());
                        }
                        new DatePickerDialog(m2Var.E(), new DatePickerDialog.OnDateSetListener() { // from class: i2
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, final int i10, final int i11, final int i12) {
                                final m2 m2Var2 = m2.this;
                                Context E = m2Var2.E();
                                TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: k2
                                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                                    public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.set(i10, i11, i12, i13, i14, 0);
                                        calendar2.set(14, 0);
                                        Long valueOf = Long.valueOf(calendar2.getTimeInMillis());
                                        m2 m2Var3 = m2.this;
                                        m2Var3.r0 = valueOf;
                                        m2Var3.L();
                                    }
                                };
                                Calendar calendar2 = calendar;
                                new TimePickerDialog(E, onTimeSetListener, calendar2.get(11), calendar2.get(12), true).show();
                            }
                        }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
                        break;
                }
            }
        });
        BottomSheetNoteBinding bottomSheetNoteBinding9 = this.o0;
        bottomSheetNoteBinding9.getClass();
        bottomSheetNoteBinding9.btnDelete.setOnClickListener(new View.OnClickListener(this) { // from class: g2
            public final /* synthetic */ m2 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String obj;
                String obj2;
                int i8 = i2;
                int i9 = 0;
                final m2 m2Var = this.g;
                switch (i8) {
                    case 0:
                        wg0 wg0Var = m2Var.p0;
                        BottomSheetNoteBinding bottomSheetNoteBinding92 = m2Var.o0;
                        bottomSheetNoteBinding92.getClass();
                        Editable text = bottomSheetNoteBinding92.etTitle.getText();
                        String str = null;
                        String obj3 = (text == null || (obj2 = text.toString()) == null) ? null : mf0.E(obj2).toString();
                        String str2 = obj3 == null ? "" : obj3;
                        int length = str2.length();
                        BottomSheetNoteBinding bottomSheetNoteBinding10 = m2Var.o0;
                        if (length != 0) {
                            bottomSheetNoteBinding10.getClass();
                            bottomSheetNoteBinding10.tilTitle.setError(null);
                            BottomSheetNoteBinding bottomSheetNoteBinding11 = m2Var.o0;
                            bottomSheetNoteBinding11.getClass();
                            Editable text2 = bottomSheetNoteBinding11.etContent.getText();
                            if (text2 != null && (obj = text2.toString()) != null) {
                                str = mf0.E(obj).toString();
                            }
                            String str3 = str == null ? "" : str;
                            BottomSheetNoteBinding bottomSheetNoteBinding12 = m2Var.o0;
                            bottomSheetNoteBinding12.getClass();
                            int checkedChipId = bottomSheetNoteBinding12.chipGroupPriority.getCheckedChipId();
                            Priority priority = checkedChipId == R.id.chipMedium ? Priority.MEDIUM : checkedChipId == R.id.chipHigh ? Priority.HIGH : checkedChipId == R.id.chipUrgent ? Priority.URGENT : Priority.LOW;
                            Context applicationContext = m2Var.E().getApplicationContext();
                            Note note2 = m2Var.q0;
                            boolean z = m2Var.s0;
                            Long l = m2Var.r0;
                            if (note2 == null) {
                                Note note3 = new Note(0, str2, str3, priority, z, l, 0L, 0L, 193, null);
                                ((NotesViewModel) wg0Var.getValue()).insert(note3, new j2(m2Var, applicationContext, note3, i9));
                            } else {
                                Note copy$default = Note.copy$default(note2, 0, str2, str3, priority, z, l, 0L, System.currentTimeMillis(), 65, null);
                                ((NotesViewModel) wg0Var.getValue()).update(copy$default);
                                applicationContext.getClass();
                                PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, note2.getId(), new Intent(applicationContext, (Class<?>) AlarmReceiver.class), 603979776);
                                if (broadcast != null) {
                                    ((AlarmManager) applicationContext.getSystemService(AlarmManager.class)).cancel(broadcast);
                                    broadcast.cancel();
                                }
                                if (m2Var.r0 != null) {
                                    gk0.M(applicationContext, copy$default);
                                }
                            }
                            Dialog dialog2 = m2Var.j0;
                            if (dialog2 instanceof l9) {
                                l9 l9Var2 = (l9) dialog2;
                                if (l9Var2.l == null) {
                                    l9Var2.h();
                                }
                                boolean z2 = l9Var2.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        } else {
                            bottomSheetNoteBinding10.getClass();
                            bottomSheetNoteBinding10.tilTitle.setError(m2Var.k(R.string.title_required));
                            break;
                        }
                        break;
                    case 1:
                        Note note4 = m2Var.q0;
                        if (note4 != null) {
                            ((NotesViewModel) m2Var.p0.getValue()).delete(note4);
                            Context applicationContext2 = m2Var.E().getApplicationContext();
                            applicationContext2.getClass();
                            PendingIntent broadcast2 = PendingIntent.getBroadcast(applicationContext2, note4.getId(), new Intent(applicationContext2, (Class<?>) AlarmReceiver.class), 603979776);
                            if (broadcast2 != null) {
                                ((AlarmManager) applicationContext2.getSystemService(AlarmManager.class)).cancel(broadcast2);
                                broadcast2.cancel();
                            }
                            Dialog dialog3 = m2Var.j0;
                            if (dialog3 instanceof l9) {
                                l9 l9Var3 = (l9) dialog3;
                                if (l9Var3.l == null) {
                                    l9Var3.h();
                                }
                                boolean z3 = l9Var3.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        }
                        break;
                    case 2:
                        m2Var.s0 = !m2Var.s0;
                        BottomSheetNoteBinding bottomSheetNoteBinding13 = m2Var.o0;
                        bottomSheetNoteBinding13.getClass();
                        bottomSheetNoteBinding13.btnPin.setText(m2Var.k(m2Var.s0 ? R.string.unpin : R.string.pin));
                        break;
                    default:
                        final Calendar calendar = Calendar.getInstance();
                        Long l2 = m2Var.r0;
                        if (l2 != null) {
                            calendar.setTimeInMillis(l2.longValue());
                        }
                        new DatePickerDialog(m2Var.E(), new DatePickerDialog.OnDateSetListener() { // from class: i2
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, final int i10, final int i11, final int i12) {
                                final m2 m2Var2 = m2.this;
                                Context E = m2Var2.E();
                                TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: k2
                                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                                    public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.set(i10, i11, i12, i13, i14, 0);
                                        calendar2.set(14, 0);
                                        Long valueOf = Long.valueOf(calendar2.getTimeInMillis());
                                        m2 m2Var3 = m2.this;
                                        m2Var3.r0 = valueOf;
                                        m2Var3.L();
                                    }
                                };
                                Calendar calendar2 = calendar;
                                new TimePickerDialog(E, onTimeSetListener, calendar2.get(11), calendar2.get(12), true).show();
                            }
                        }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
                        break;
                }
            }
        });
        BottomSheetNoteBinding bottomSheetNoteBinding10 = this.o0;
        bottomSheetNoteBinding10.getClass();
        bottomSheetNoteBinding10.btnPin.setOnClickListener(new View.OnClickListener(this) { // from class: g2
            public final /* synthetic */ m2 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String obj;
                String obj2;
                int i8 = i4;
                int i9 = 0;
                final m2 m2Var = this.g;
                switch (i8) {
                    case 0:
                        wg0 wg0Var = m2Var.p0;
                        BottomSheetNoteBinding bottomSheetNoteBinding92 = m2Var.o0;
                        bottomSheetNoteBinding92.getClass();
                        Editable text = bottomSheetNoteBinding92.etTitle.getText();
                        String str = null;
                        String obj3 = (text == null || (obj2 = text.toString()) == null) ? null : mf0.E(obj2).toString();
                        String str2 = obj3 == null ? "" : obj3;
                        int length = str2.length();
                        BottomSheetNoteBinding bottomSheetNoteBinding102 = m2Var.o0;
                        if (length != 0) {
                            bottomSheetNoteBinding102.getClass();
                            bottomSheetNoteBinding102.tilTitle.setError(null);
                            BottomSheetNoteBinding bottomSheetNoteBinding11 = m2Var.o0;
                            bottomSheetNoteBinding11.getClass();
                            Editable text2 = bottomSheetNoteBinding11.etContent.getText();
                            if (text2 != null && (obj = text2.toString()) != null) {
                                str = mf0.E(obj).toString();
                            }
                            String str3 = str == null ? "" : str;
                            BottomSheetNoteBinding bottomSheetNoteBinding12 = m2Var.o0;
                            bottomSheetNoteBinding12.getClass();
                            int checkedChipId = bottomSheetNoteBinding12.chipGroupPriority.getCheckedChipId();
                            Priority priority = checkedChipId == R.id.chipMedium ? Priority.MEDIUM : checkedChipId == R.id.chipHigh ? Priority.HIGH : checkedChipId == R.id.chipUrgent ? Priority.URGENT : Priority.LOW;
                            Context applicationContext = m2Var.E().getApplicationContext();
                            Note note2 = m2Var.q0;
                            boolean z = m2Var.s0;
                            Long l = m2Var.r0;
                            if (note2 == null) {
                                Note note3 = new Note(0, str2, str3, priority, z, l, 0L, 0L, 193, null);
                                ((NotesViewModel) wg0Var.getValue()).insert(note3, new j2(m2Var, applicationContext, note3, i9));
                            } else {
                                Note copy$default = Note.copy$default(note2, 0, str2, str3, priority, z, l, 0L, System.currentTimeMillis(), 65, null);
                                ((NotesViewModel) wg0Var.getValue()).update(copy$default);
                                applicationContext.getClass();
                                PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, note2.getId(), new Intent(applicationContext, (Class<?>) AlarmReceiver.class), 603979776);
                                if (broadcast != null) {
                                    ((AlarmManager) applicationContext.getSystemService(AlarmManager.class)).cancel(broadcast);
                                    broadcast.cancel();
                                }
                                if (m2Var.r0 != null) {
                                    gk0.M(applicationContext, copy$default);
                                }
                            }
                            Dialog dialog2 = m2Var.j0;
                            if (dialog2 instanceof l9) {
                                l9 l9Var2 = (l9) dialog2;
                                if (l9Var2.l == null) {
                                    l9Var2.h();
                                }
                                boolean z2 = l9Var2.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        } else {
                            bottomSheetNoteBinding102.getClass();
                            bottomSheetNoteBinding102.tilTitle.setError(m2Var.k(R.string.title_required));
                            break;
                        }
                        break;
                    case 1:
                        Note note4 = m2Var.q0;
                        if (note4 != null) {
                            ((NotesViewModel) m2Var.p0.getValue()).delete(note4);
                            Context applicationContext2 = m2Var.E().getApplicationContext();
                            applicationContext2.getClass();
                            PendingIntent broadcast2 = PendingIntent.getBroadcast(applicationContext2, note4.getId(), new Intent(applicationContext2, (Class<?>) AlarmReceiver.class), 603979776);
                            if (broadcast2 != null) {
                                ((AlarmManager) applicationContext2.getSystemService(AlarmManager.class)).cancel(broadcast2);
                                broadcast2.cancel();
                            }
                            Dialog dialog3 = m2Var.j0;
                            if (dialog3 instanceof l9) {
                                l9 l9Var3 = (l9) dialog3;
                                if (l9Var3.l == null) {
                                    l9Var3.h();
                                }
                                boolean z3 = l9Var3.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        }
                        break;
                    case 2:
                        m2Var.s0 = !m2Var.s0;
                        BottomSheetNoteBinding bottomSheetNoteBinding13 = m2Var.o0;
                        bottomSheetNoteBinding13.getClass();
                        bottomSheetNoteBinding13.btnPin.setText(m2Var.k(m2Var.s0 ? R.string.unpin : R.string.pin));
                        break;
                    default:
                        final Calendar calendar = Calendar.getInstance();
                        Long l2 = m2Var.r0;
                        if (l2 != null) {
                            calendar.setTimeInMillis(l2.longValue());
                        }
                        new DatePickerDialog(m2Var.E(), new DatePickerDialog.OnDateSetListener() { // from class: i2
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, final int i10, final int i11, final int i12) {
                                final m2 m2Var2 = m2.this;
                                Context E = m2Var2.E();
                                TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: k2
                                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                                    public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.set(i10, i11, i12, i13, i14, 0);
                                        calendar2.set(14, 0);
                                        Long valueOf = Long.valueOf(calendar2.getTimeInMillis());
                                        m2 m2Var3 = m2.this;
                                        m2Var3.r0 = valueOf;
                                        m2Var3.L();
                                    }
                                };
                                Calendar calendar2 = calendar;
                                new TimePickerDialog(E, onTimeSetListener, calendar2.get(11), calendar2.get(12), true).show();
                            }
                        }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
                        break;
                }
            }
        });
        BottomSheetNoteBinding bottomSheetNoteBinding11 = this.o0;
        bottomSheetNoteBinding11.getClass();
        bottomSheetNoteBinding11.btnAlert.setOnClickListener(new View.OnClickListener(this) { // from class: g2
            public final /* synthetic */ m2 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String obj;
                String obj2;
                int i8 = i3;
                int i9 = 0;
                final m2 m2Var = this.g;
                switch (i8) {
                    case 0:
                        wg0 wg0Var = m2Var.p0;
                        BottomSheetNoteBinding bottomSheetNoteBinding92 = m2Var.o0;
                        bottomSheetNoteBinding92.getClass();
                        Editable text = bottomSheetNoteBinding92.etTitle.getText();
                        String str = null;
                        String obj3 = (text == null || (obj2 = text.toString()) == null) ? null : mf0.E(obj2).toString();
                        String str2 = obj3 == null ? "" : obj3;
                        int length = str2.length();
                        BottomSheetNoteBinding bottomSheetNoteBinding102 = m2Var.o0;
                        if (length != 0) {
                            bottomSheetNoteBinding102.getClass();
                            bottomSheetNoteBinding102.tilTitle.setError(null);
                            BottomSheetNoteBinding bottomSheetNoteBinding112 = m2Var.o0;
                            bottomSheetNoteBinding112.getClass();
                            Editable text2 = bottomSheetNoteBinding112.etContent.getText();
                            if (text2 != null && (obj = text2.toString()) != null) {
                                str = mf0.E(obj).toString();
                            }
                            String str3 = str == null ? "" : str;
                            BottomSheetNoteBinding bottomSheetNoteBinding12 = m2Var.o0;
                            bottomSheetNoteBinding12.getClass();
                            int checkedChipId = bottomSheetNoteBinding12.chipGroupPriority.getCheckedChipId();
                            Priority priority = checkedChipId == R.id.chipMedium ? Priority.MEDIUM : checkedChipId == R.id.chipHigh ? Priority.HIGH : checkedChipId == R.id.chipUrgent ? Priority.URGENT : Priority.LOW;
                            Context applicationContext = m2Var.E().getApplicationContext();
                            Note note2 = m2Var.q0;
                            boolean z = m2Var.s0;
                            Long l = m2Var.r0;
                            if (note2 == null) {
                                Note note3 = new Note(0, str2, str3, priority, z, l, 0L, 0L, 193, null);
                                ((NotesViewModel) wg0Var.getValue()).insert(note3, new j2(m2Var, applicationContext, note3, i9));
                            } else {
                                Note copy$default = Note.copy$default(note2, 0, str2, str3, priority, z, l, 0L, System.currentTimeMillis(), 65, null);
                                ((NotesViewModel) wg0Var.getValue()).update(copy$default);
                                applicationContext.getClass();
                                PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, note2.getId(), new Intent(applicationContext, (Class<?>) AlarmReceiver.class), 603979776);
                                if (broadcast != null) {
                                    ((AlarmManager) applicationContext.getSystemService(AlarmManager.class)).cancel(broadcast);
                                    broadcast.cancel();
                                }
                                if (m2Var.r0 != null) {
                                    gk0.M(applicationContext, copy$default);
                                }
                            }
                            Dialog dialog2 = m2Var.j0;
                            if (dialog2 instanceof l9) {
                                l9 l9Var2 = (l9) dialog2;
                                if (l9Var2.l == null) {
                                    l9Var2.h();
                                }
                                boolean z2 = l9Var2.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        } else {
                            bottomSheetNoteBinding102.getClass();
                            bottomSheetNoteBinding102.tilTitle.setError(m2Var.k(R.string.title_required));
                            break;
                        }
                        break;
                    case 1:
                        Note note4 = m2Var.q0;
                        if (note4 != null) {
                            ((NotesViewModel) m2Var.p0.getValue()).delete(note4);
                            Context applicationContext2 = m2Var.E().getApplicationContext();
                            applicationContext2.getClass();
                            PendingIntent broadcast2 = PendingIntent.getBroadcast(applicationContext2, note4.getId(), new Intent(applicationContext2, (Class<?>) AlarmReceiver.class), 603979776);
                            if (broadcast2 != null) {
                                ((AlarmManager) applicationContext2.getSystemService(AlarmManager.class)).cancel(broadcast2);
                                broadcast2.cancel();
                            }
                            Dialog dialog3 = m2Var.j0;
                            if (dialog3 instanceof l9) {
                                l9 l9Var3 = (l9) dialog3;
                                if (l9Var3.l == null) {
                                    l9Var3.h();
                                }
                                boolean z3 = l9Var3.l.J;
                            }
                            m2Var.I(false, false);
                            break;
                        }
                        break;
                    case 2:
                        m2Var.s0 = !m2Var.s0;
                        BottomSheetNoteBinding bottomSheetNoteBinding13 = m2Var.o0;
                        bottomSheetNoteBinding13.getClass();
                        bottomSheetNoteBinding13.btnPin.setText(m2Var.k(m2Var.s0 ? R.string.unpin : R.string.pin));
                        break;
                    default:
                        final Calendar calendar = Calendar.getInstance();
                        Long l2 = m2Var.r0;
                        if (l2 != null) {
                            calendar.setTimeInMillis(l2.longValue());
                        }
                        new DatePickerDialog(m2Var.E(), new DatePickerDialog.OnDateSetListener() { // from class: i2
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, final int i10, final int i11, final int i12) {
                                final m2 m2Var2 = m2.this;
                                Context E = m2Var2.E();
                                TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: k2
                                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                                    public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.set(i10, i11, i12, i13, i14, 0);
                                        calendar2.set(14, 0);
                                        Long valueOf = Long.valueOf(calendar2.getTimeInMillis());
                                        m2 m2Var3 = m2.this;
                                        m2Var3.r0 = valueOf;
                                        m2Var3.L();
                                    }
                                };
                                Calendar calendar2 = calendar;
                                new TimePickerDialog(E, onTimeSetListener, calendar2.get(11), calendar2.get(12), true).show();
                            }
                        }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
                        break;
                }
            }
        });
    }

    public final void L() {
        Long l = this.r0;
        if (l == null) {
            BottomSheetNoteBinding bottomSheetNoteBinding = this.o0;
            bottomSheetNoteBinding.getClass();
            bottomSheetNoteBinding.tvReminderTime.setVisibility(8);
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, HH:mm", Locale.getDefault());
        BottomSheetNoteBinding bottomSheetNoteBinding2 = this.o0;
        bottomSheetNoteBinding2.getClass();
        bottomSheetNoteBinding2.tvReminderTime.setText(E().getResources().getString(R.string.alert_set, simpleDateFormat.format(new Date(l.longValue()))));
        BottomSheetNoteBinding bottomSheetNoteBinding3 = this.o0;
        bottomSheetNoteBinding3.getClass();
        bottomSheetNoteBinding3.tvReminderTime.setVisibility(0);
    }

    @Override // androidx.fragment.app.a
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        BottomSheetNoteBinding inflate = BottomSheetNoteBinding.inflate(layoutInflater, viewGroup, false);
        this.o0 = inflate;
        inflate.getClass();
        NestedScrollView root = inflate.getRoot();
        root.getClass();
        return root;
    }

    @Override // defpackage.vj, androidx.fragment.app.a
    public final void u() {
        super.u();
        this.o0 = null;
    }
}
