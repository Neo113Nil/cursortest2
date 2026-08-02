package com.neptunesoft.bacdz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.adapter.AdapterMarks;
import com.neptunesoft.bacdz.classobjects.Avg;
import com.neptunesoft.bacdz.classobjects.Mark;
import com.neptunesoft.bacdz.database.DataBaseMarks;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ListMarksActivity extends AppCompatActivity {
    static AdapterMarks adapterMarks;
    static Avg avg;
    static List<Object> list = new ArrayList();
    static RecyclerView listMarksRecyclerView;
    Button deleteMarks;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_marks);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.ListMarksActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ListMarksActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        listMarksRecyclerView = (RecyclerView) findViewById(R.id.listMarksRecyclerView);
        this.deleteMarks = (Button) findViewById(R.id.deleteMarks);
        listMarksRecyclerView.setHasFixedSize(false);
        listMarksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.deleteMarks.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.ListMarksActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListMarksActivity.this.m656lambda$onCreate$4$comneptunesoftbacdzListMarksActivity(view);
            }
        });
        refreshRecycleView(this);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-bacdz-ListMarksActivity, reason: not valid java name */
    /* synthetic */ void m656lambda$onCreate$4$comneptunesoftbacdzListMarksActivity(View view) {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.ListMarksActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ListMarksActivity.this.m654lambda$onCreate$1$comneptunesoftbacdzListMarksActivity(create, dialogInterface);
            }
        });
        create.setMessage("هل تريد حذف هذا الثلاثي ؟\nتنبيه : عملية الحذف هذه ستؤدي إلى حذف جميع العلامات في كل المواد الخاصة بهذا الثلاثي فقط.");
        create.setButton(-1, "حذف", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.ListMarksActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ListMarksActivity.this.m655lambda$onCreate$2$comneptunesoftbacdzListMarksActivity(create, dialogInterface, i);
            }
        });
        create.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.ListMarksActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-ListMarksActivity, reason: not valid java name */
    /* synthetic */ void m654lambda$onCreate$1$comneptunesoftbacdzListMarksActivity(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-ListMarksActivity, reason: not valid java name */
    /* synthetic */ void m655lambda$onCreate$2$comneptunesoftbacdzListMarksActivity(AlertDialog alertDialog, DialogInterface dialogInterface, int i) {
        alertDialog.dismiss();
        new DataBaseMarks(this, SplashScreen.darkmode).deleteTriple(avg.getId_triple());
        Toast.makeText(this, "تمت عملية الحذف بنجاح", 0).show();
        AvgActivity.refreshRecycleView(this);
        finish();
    }

    static void refreshRecycleView(final Context context) {
        DataBaseMarks dataBaseMarks = new DataBaseMarks(context, SplashScreen.darkmode);
        list.clear();
        list = dataBaseMarks.getAllMarks(avg.getId_triple());
        AdapterMarks adapterMarks2 = new AdapterMarks(list);
        adapterMarks = adapterMarks2;
        listMarksRecyclerView.setAdapter(adapterMarks2);
        adapterMarks.setClickListener(new AdapterMarks.ItemClickListener() { // from class: com.neptunesoft.bacdz.ListMarksActivity$$ExternalSyntheticLambda0
            @Override // com.neptunesoft.bacdz.adapter.AdapterMarks.ItemClickListener
            public final void onItemClick(View view, int i) {
                ListMarksActivity.lambda$refreshRecycleView$5(context, view, i);
            }
        });
    }

    static /* synthetic */ void lambda$refreshRecycleView$5(Context context, View view, int i) {
        ShowEditMarkActivity.mark = (Mark) list.get(i);
        context.startActivity(new Intent(context, (Class<?>) ShowEditMarkActivity.class));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        AvgActivity.refreshRecycleView(this);
    }
}
