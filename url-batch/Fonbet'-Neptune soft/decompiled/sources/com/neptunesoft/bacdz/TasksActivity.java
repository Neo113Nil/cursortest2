package com.neptunesoft.bacdz;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Insets;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.neptunesoft.bacdz.adapter.TaskAdapter;
import com.neptunesoft.bacdz.database.DataBaseTasks;
import com.neptunesoft.bacdz.entities.Task;
import com.neptunesoft.bacdz.listeners.TasksListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class TasksActivity extends AppCompatActivity implements TasksListener {
    public static final int Request_Code_Add_Task = 1;
    public static final int Request_Code_RELOAD = 4;
    public static final int Request_Code_SHOW_Task = 3;
    public static final int Request_UPDATE_Task = 2;
    private AlertDialog dialogDeleteTask;
    EditText edittextSearch;
    ImageView floating_addtask;
    ImageView img_clear;
    private TaskAdapter taskAdapter;
    public int taskClickPosition = -1;
    private List<Task> taskList;
    private RecyclerView tasksRecyclerView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return TasksActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.floating_addtask = (ImageView) findViewById(R.id.floating_addtask);
        this.edittextSearch = (EditText) findViewById(R.id.edittextSearch);
        this.img_clear = (ImageView) findViewById(R.id.img_clear);
        refreshUI();
        this.img_clear.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TasksActivity.this.m753lambda$onCreate$1$comneptunesoftbacdzTasksActivity(view);
            }
        });
        this.floating_addtask.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TasksActivity.this.m754lambda$onCreate$2$comneptunesoftbacdzTasksActivity(view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tasksRecyclerView);
        this.tasksRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, 1));
        this.taskList = new ArrayList();
        TaskAdapter taskAdapter = new TaskAdapter(this.taskList, this);
        this.taskAdapter = taskAdapter;
        this.tasksRecyclerView.setAdapter(taskAdapter);
        getTasks(3, false);
        this.edittextSearch.addTextChangedListener(new TextWatcher() { // from class: com.neptunesoft.bacdz.TasksActivity.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TasksActivity.this.taskAdapter.cancelTimer();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (TasksActivity.this.taskList.size() != 0) {
                    TasksActivity.this.taskAdapter.searchTasks(s.toString());
                }
                if (s.toString().equals("")) {
                    TasksActivity.this.img_clear.setVisibility(8);
                } else {
                    TasksActivity.this.img_clear.setVisibility(0);
                }
            }
        });
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

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m753lambda$onCreate$1$comneptunesoftbacdzTasksActivity(View view) {
        this.edittextSearch.setText("");
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m754lambda$onCreate$2$comneptunesoftbacdzTasksActivity(View view) {
        this.edittextSearch.setText("");
        this.taskAdapter.cancelTimer();
        startActivityForResult(new Intent(this, (Class<?>) CreateTaskActivity.class), 1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            getTasks(1, false);
        } else if (requestCode == 2 && resultCode == -1 && data != null) {
            getTasks(2, data.getBooleanExtra("isTaskDeleted", false));
        }
    }

    @Override // com.neptunesoft.bacdz.listeners.TasksListener
    public void onTaskClick(Task task, int position) {
        this.taskClickPosition = position;
        Intent intent = new Intent(this, (Class<?>) CreateTaskActivity.class);
        intent.putExtra("isViewOrUpdate", true);
        intent.putExtra("task", task);
        finishOrUpdate(intent, task);
    }

    private void finishOrUpdate(final Intent intent, final Task task) {
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialogDeleteTask = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TasksActivity.this.m747lambda$finishOrUpdate$3$comneptunesoftbacdzTasksActivity(dialogInterface);
            }
        });
        if (!task.isChecked()) {
            this.dialogDeleteTask.setMessage("هل تريد إتمام أو تعديل هذه المهمة ؟.");
            this.dialogDeleteTask.setButton(-1, "إتمام", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TasksActivity.this.m748lambda$finishOrUpdate$4$comneptunesoftbacdzTasksActivity(task, dialogInterface, i);
                }
            });
            this.dialogDeleteTask.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TasksActivity.this.m749lambda$finishOrUpdate$5$comneptunesoftbacdzTasksActivity(dialogInterface, i);
                }
            });
            this.dialogDeleteTask.setButton(-3, "تعديل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TasksActivity.this.m750lambda$finishOrUpdate$6$comneptunesoftbacdzTasksActivity(intent, dialogInterface, i);
                }
            });
        } else {
            this.dialogDeleteTask.setMessage("هل تريد حذف هذه المهمة ؟.");
            this.dialogDeleteTask.setButton(-1, "حذف", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TasksActivity.this.m751lambda$finishOrUpdate$7$comneptunesoftbacdzTasksActivity(task, dialogInterface, i);
                }
            });
            this.dialogDeleteTask.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TasksActivity$$ExternalSyntheticLambda8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TasksActivity.this.m752lambda$finishOrUpdate$8$comneptunesoftbacdzTasksActivity(dialogInterface, i);
                }
            });
        }
        this.dialogDeleteTask.show();
    }

    /* renamed from: lambda$finishOrUpdate$3$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m747lambda$finishOrUpdate$3$comneptunesoftbacdzTasksActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialogDeleteTask.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialogDeleteTask.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
        this.dialogDeleteTask.getButton(-3).setTextColor(getResources().getColor(R.color.blue));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.neptunesoft.bacdz.TasksActivity$1saveTaskTask] */
    /* renamed from: lambda$finishOrUpdate$4$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m748lambda$finishOrUpdate$4$comneptunesoftbacdzTasksActivity(final Task task, DialogInterface dialogInterface, int i) {
        task.setChecked(true);
        new AsyncTask<Void, Void, Void>() { // from class: com.neptunesoft.bacdz.TasksActivity.1saveTaskTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voids) {
                DataBaseTasks.getDataBase(TasksActivity.this.getApplicationContext()).taskDao().insertTask(task);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void aVoid) {
                super.onPostExecute((C1saveTaskTask) aVoid);
                Intent intent = new Intent();
                TasksActivity.this.setResult(-1, intent);
                TasksActivity.this.onActivityResult(4, -1, intent);
                TasksActivity.this.taskList.clear();
                TasksActivity.this.getTasks(3, false);
            }
        }.execute(new Void[0]);
        dialogInterface.dismiss();
    }

    /* renamed from: lambda$finishOrUpdate$5$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m749lambda$finishOrUpdate$5$comneptunesoftbacdzTasksActivity(DialogInterface dialogInterface, int i) {
        this.dialogDeleteTask.dismiss();
    }

    /* renamed from: lambda$finishOrUpdate$6$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m750lambda$finishOrUpdate$6$comneptunesoftbacdzTasksActivity(Intent intent, DialogInterface dialogInterface, int i) {
        this.dialogDeleteTask.dismiss();
        startActivityForResult(intent, 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.neptunesoft.bacdz.TasksActivity$1DeleteTaskTask] */
    /* renamed from: lambda$finishOrUpdate$7$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m751lambda$finishOrUpdate$7$comneptunesoftbacdzTasksActivity(final Task task, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        new AsyncTask<Void, Void, Void>() { // from class: com.neptunesoft.bacdz.TasksActivity.1DeleteTaskTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voids) {
                DataBaseTasks.getDataBase(TasksActivity.this.getApplicationContext()).taskDao().deleteTask(task);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void aVoid) {
                super.onPostExecute((C1DeleteTaskTask) aVoid);
                Intent intent = new Intent();
                intent.putExtra("isTaskDeleted", true);
                TasksActivity.this.setResult(-1, intent);
                TasksActivity.this.taskList.remove(TasksActivity.this.taskClickPosition);
                TasksActivity.this.taskAdapter.notifyItemRemoved(TasksActivity.this.taskClickPosition);
            }
        }.execute(new Void[0]);
    }

    /* renamed from: lambda$finishOrUpdate$8$com-neptunesoft-bacdz-TasksActivity, reason: not valid java name */
    /* synthetic */ void m752lambda$finishOrUpdate$8$comneptunesoftbacdzTasksActivity(DialogInterface dialogInterface, int i) {
        this.dialogDeleteTask.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.neptunesoft.bacdz.TasksActivity$1GetTaskTask] */
    public void getTasks(final int request, final boolean isTaskDeleted) {
        new AsyncTask<Void, Void, List<Task>>() { // from class: com.neptunesoft.bacdz.TasksActivity.1GetTaskTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public List<Task> doInBackground(Void... voids) {
                return DataBaseTasks.getDataBase(TasksActivity.this.getApplicationContext()).taskDao().getAllTasks();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(List<Task> tasks) {
                super.onPostExecute((C1GetTaskTask) tasks);
                int i = request;
                if (i == 3) {
                    TasksActivity.this.taskList.addAll(tasks);
                    TasksActivity.this.taskAdapter.notifyDataSetChanged();
                } else if (i == 1) {
                    TasksActivity.this.taskList.add(0, tasks.get(0));
                    TasksActivity.this.taskAdapter.notifyItemInserted(0);
                    TasksActivity.this.tasksRecyclerView.smoothScrollToPosition(0);
                } else if (i == 2) {
                    TasksActivity.this.taskList.remove(TasksActivity.this.taskClickPosition);
                    if (isTaskDeleted) {
                        TasksActivity.this.taskAdapter.notifyItemRemoved(TasksActivity.this.taskClickPosition);
                    } else {
                        TasksActivity.this.taskList.add(TasksActivity.this.taskClickPosition, tasks.get(TasksActivity.this.taskClickPosition));
                        TasksActivity.this.taskAdapter.notifyItemChanged(TasksActivity.this.taskClickPosition);
                    }
                }
                TasksActivity.this.tasksRecyclerView.smoothScrollToPosition(0);
            }
        }.execute(new Void[0]);
    }

    void refreshUI() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutSearch);
        ImageView imageView = (ImageView) findViewById(R.id.img_search);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.lytquickaction);
        ImageView imageView2 = (ImageView) findViewById(R.id.img_clear);
        if (SplashScreen.darkmode) {
            linearLayout.setBackgroundResource(R.drawable.background_search_dark);
            imageView.setImageResource(R.drawable.ic_search_dark);
            linearLayout2.setBackgroundColor(Color.parseColor("#464547"));
            imageView2.setImageResource(R.drawable.ic_clear_search_content_dark);
            return;
        }
        linearLayout.setBackgroundResource(R.drawable.background_search);
        imageView.setImageResource(R.drawable.ic_search);
        linearLayout2.setBackgroundColor(Color.parseColor("#E0DFE6"));
        imageView2.setImageResource(R.drawable.ic_clear_search_content);
    }
}
